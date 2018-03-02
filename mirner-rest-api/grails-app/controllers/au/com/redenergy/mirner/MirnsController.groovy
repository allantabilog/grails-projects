package au.com.redenergy.mirner

import au.com.redenergy.mirner.service.MirnLookupService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired

import java.time.LocalDateTime

@Slf4j
class MirnsController {

    static defaultAction = "index"

    @Autowired
    MirnLookupService lookupService

    def index() {
        render(view: 'index', model: [timestamp: LocalDateTime.now() as String])
    }


    def scopes() {
        def model = [timestamp: LocalDateTime.now() as String,
                     params   : params]

        log.info("Model: ${model}")
        log.info("Operation: ${params.operation} Value: ${params.value}")

        render(view: 'scopes', model: model)
    }

    def search() {

        validateParams(params)

        def searchRequest = new SearchRequestBuilder().params(params).build()

        log.info("New request: ${searchRequest}")

        def mirns = lookupService.searchMirn(searchRequest)

        SearchResult searchResult = new SearchResult()
        searchResult.setProperty('mirns', mirns)

        def model = [searchResult: searchResult]

        log.info("Model: ${model}")

        render(view: 'searchResultSandbox', model: model)
    }

    private void validateParams(Map params) {
        /**

         Work out the validation rules.
         e.g. brand is mandatory
         at least one of the following is mandatory:
            - mirn
            - meter number
            - an address component

         */

    }

}

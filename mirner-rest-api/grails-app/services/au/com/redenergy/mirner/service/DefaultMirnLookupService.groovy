package au.com.redenergy.mirner.service

import au.com.redenergy.mirner.MirnResult
import au.com.redenergy.mirner.SearchRequest
import au.com.redenergy.mirner.service.data.LumoMirnDataService
import au.com.redenergy.mirner.service.data.RedMirnDataService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired

/**
 * Use strategy pattern to determine whether to use Red or Lumo lookup logic?
 */

@Slf4j
class DefaultMirnLookupService implements MirnLookupService {

    @Autowired
    RedMirnDataService redMirnDataService

    @Autowired
    LumoMirnDataService lumoMirnDataService

    private final String RED_BRAND = 'REDE'

    @Override
    Collection<MirnResult> searchMirn(SearchRequest searchRequest) {
        log.info("Invoked searchMirn($searchRequest)")

        searchRequest.brand == RED_BRAND ? redMirnDataService.searchMirn(searchRequest) : lumoMirnDataService.searchMirn(searchRequest)
    }
}

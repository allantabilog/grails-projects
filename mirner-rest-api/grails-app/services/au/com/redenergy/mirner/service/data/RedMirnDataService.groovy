package au.com.redenergy.mirner.service.data

import au.com.redenergy.mirner.MirnResult
import au.com.redenergy.mirner.SearchRequest

class RedMirnDataService implements MirnDataService{
    Collection<MirnResult> searchMirn(SearchRequest request) {
        log.info("Invoked Red mirn data service: ${request}")
        []
    }
}
package au.com.redenergy.mirner.service

import au.com.redenergy.mirner.Address
import au.com.redenergy.mirner.MeterNumber
import au.com.redenergy.mirner.Mirn
import au.com.redenergy.mirner.MirnResult
import au.com.redenergy.mirner.SearchRequest
import groovy.util.logging.Slf4j

/**
 * Use strategy pattern to determine whether to use Red or Lumo lookup logic?
 */

@Slf4j
class DefaultMirnLookupService implements MirnLookupService {
    @Override
    Collection<MirnResult> searchMirn(SearchRequest searchRequest) {
        log.info("Invoked searchMirn($searchRequest)")

        Collection<MirnResult> mirnResults = []
        return mirnResults
    }
}

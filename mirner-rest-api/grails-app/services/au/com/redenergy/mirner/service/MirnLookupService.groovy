package au.com.redenergy.mirner.service

import au.com.redenergy.mirner.MirnResult
import au.com.redenergy.mirner.SearchRequest
import grails.gorm.transactions.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
interface MirnLookupService {

    Collection<MirnResult> searchMirn(SearchRequest searchRequest)

}

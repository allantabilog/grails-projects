package au.com.redenergy.mirner.service.data

import au.com.redenergy.mirner.MirnResult
import au.com.redenergy.mirner.SearchRequest
import grails.gorm.transactions.Transactional
import org.springframework.stereotype.Service


@Transactional
@Service
interface MirnDataService {
    Collection<MirnResult> searchMirn(SearchRequest request)
}
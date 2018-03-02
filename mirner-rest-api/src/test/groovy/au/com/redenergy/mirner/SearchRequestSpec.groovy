package au.com.redenergy.mirner

import spock.lang.Specification

class SearchRequestSpec extends Specification {
    def "Should create a search request from a map parameter"() {
        given:
        def builder = new SearchRequestBuilder()
        def params = [mirn: '5123456789', meterNumber: '1234567', unitNumber: '2A', streetNumber: '2', streetName: 'William Street', suburb: 'Richmond', postcode: '3132', state: 'VIC']

        when:
        def request = builder.params(params).build()

        then:
        request != null

        request.mirn.mirn == params.mirn
        request.meterNumber.meterNumber == params.meterNumber
        request.address.flatOrUnitNumber == params.unitNumber
        request.address.streetNumber == params.streetNumber
        request.address.suburb == params.suburb
        request.address.state == params.state
        request.address.postCode == params.postcode
    }
}

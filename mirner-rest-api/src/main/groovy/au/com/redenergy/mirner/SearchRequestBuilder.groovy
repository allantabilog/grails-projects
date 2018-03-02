package au.com.redenergy.mirner

import groovy.util.logging.Slf4j

@Slf4j
class SearchRequestBuilder {

    String brand
    Address address
    MeterNumber meterNumber
    Mirn mirn

    SearchRequest build() {
        new SearchRequest(address: this.address, meterNumber: this.meterNumber, mirn: this.mirn)
    }

    SearchRequestBuilder params(Map params) {
        this.brand = params.brand
        this.address = new Address(flatOrUnitNumber: params.unitNumber, streetNumber: params.streetNumber, suburb: params.suburb, state: params.state, postCode: params.postcode)
        this.meterNumber = new MeterNumber(meterNumber: params.meterNumber)
        this.mirn = new Mirn(mirn: params.mirn)
        this
    }

    SearchRequestBuilder brand(String brand) {
        this.brand = brand
        this
    }

    SearchRequestBuilder address(Address address) {
        this.address = address
        this
    }

    SearchRequestBuilder meterNumber(MeterNumber meterNumber) {
        this.meterNumber = meterNumber
        this
    }

    SearchRequestBuilder mirn(Mirn mirn) {
        this.mirn = mirn
        this
    }

}

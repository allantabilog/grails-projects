package au.com.redenergy.mirner

import groovy.transform.Canonical
import groovy.transform.ToString

@Canonical
@ToString(includePackage = false, includeNames = true)
class SearchRequest {
    String brand
    Address address
    Mirn mirn
    MeterNumber meterNumber

}

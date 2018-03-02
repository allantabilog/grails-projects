package au.com.redenergy.mirner

import groovy.transform.Canonical
import groovy.transform.ToString

@Canonical
@ToString(includePackage = false, includeNames = true)
class Address {
    String flatOrUnitNumber
    String streetNumber
    String streetName
    String suburb
    String state
    String postCode
}

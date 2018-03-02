package au.com.redenergy.mirner

import groovy.transform.Canonical
import groovy.transform.ToString


@Canonical
@ToString(includePackage = false, includeNames = true)
class MirnResult {
    String mirn
    String meterNumber
    String address
    String warning

    String getKey() {
        "$mirn-$meterNumber"
    }
}

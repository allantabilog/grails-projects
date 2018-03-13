package au.com.allan

import groovy.transform.ToString


@ToString
class AccountType {

    String code
    String description

    static constraints = {
        code nullable: false
        description nullable: false
    }
}

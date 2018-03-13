package au.com.allan

import groovy.transform.ToString

@ToString
class Account {

    String name
    Double balance
    AccountType type
    AccountStatus status

    static constraints = {
        balance nullable: true
    }
}

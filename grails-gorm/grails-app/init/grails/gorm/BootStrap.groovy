package grails.gorm

import au.com.allan.Account
import au.com.allan.AccountStatus
import au.com.allan.AccountType

class BootStrap {

    def init = { servletContext ->

        def pending = new AccountStatus(code: 'PN', description: 'Pending').save()
        def active = new AccountStatus(code: 'AC', description: 'Active').save()
        def business = new AccountType(code: 'B', description: 'Business').save()
        def personal = new AccountType(code: 'P', description: 'Personal').save()

        new Account(name: 'Manjo', balance: 100.0, status: pending, type: personal).save()
        new Account(name: 'Maria Estella', status: active, type: business).save()
        new Account(name: 'ZHAO', status: active, type: business).save()
        new Account(name: 'Tiggy Tabilog', status: active, type: business).save()
        new Account(name: 'Templer Enterprises', status: active, type: business).save()
        new Account(name: 'Rabbi Enterprises', status: active, type: business).save()


    }
    def destroy = {
    }
}

package hibernate.example

import grails.compiler.GrailsCompileStatic
import groovy.transform.ToString

@GrailsCompileStatic
@ToString(includeNames = true)
class Product {

    String name
    double price

    static constraints = {
        name blank: false
        price range: 0.0..1000.00
    }

}

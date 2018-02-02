package hibernate.example

import org.grails.testing.GrailsUnitTest
import spock.lang.Specification
import grails.testing.web.controllers.ControllerUnitTest
import grails.test.hibernate.HibernateSpec

class ProductControllerSpec extends HibernateSpec implements ControllerUnitTest<ProductController>{

    static doWithSpring = {
        jsonSmartViewResolver(JsonViewResolver)
    }

    void setup() {
        Product.saveAll(
                new Product(name: 'Apple', price: 2.0),
                new Product(name: 'Orange', price: 3.0),
                new Product(name: 'Banana', price: 1.0),
                new Product(name: 'Cake', price: 4.0)
        )
    }

    void 'test that the search action finds results'() {
        when: 'A query is executed that finds results'
        controller.search('pp', 10)

        then: 'The response is correct'
        response.json.size() == 1
        response.json[0].name == 'Apple'

    }
}
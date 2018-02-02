package hibernate.example

import grails.test.hibernate.HibernateSpec

@SuppressWarnings(['MethodName', 'DuplicateNumberLiteral'])
class ProductSpec extends HibernateSpec {

    void 'test domain class validation'(){
        when: 'A domain class is saved with invalid data'
        Product product = new Product(name: '', price: -2.0d)
        product.save()

        then: 'There were errors and the data was not saved'
        product.hasErrors()
        product.errors.getFieldError('price')
        product.errors.getFieldError('name')
        Product.count() == 0

        when: 'A valid domain object is saved'
        product.name = 'Banana'
        product.price = 2.15d
        product.save()

        then: 'The product was saved successfully'
        Product.count() == 1
        Product.first().price == 2.15d
    }

    void 'test basic CRUD'(){
        when:
        Product product = new Product(name: 'Google Pixel 2', price: '999.99')
        product.save()

        then:
        println 'Running basic CRUD test for Product domain class'

        when:
        def p2 = Product.create()

        then:
        p2.name == null
        p2.price == 0.0

    }
}

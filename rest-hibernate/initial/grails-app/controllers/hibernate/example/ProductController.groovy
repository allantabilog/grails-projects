package hibernate.example


import grails.rest.*
import grails.converters.*
import groovy.transform.CompileStatic

@CompileStatic
class ProductController extends RestfulController {
    static responseFormats = ['json', 'xml']

    ProductController() {
        super(Product)
    }

    def search(String q, Integer max) {
        if (q) {
            def query = Product.where {
                name ==~ "%${q}%"
            }
            respond query.list(max: Math.min(max ?: 100, 500))
        } else {
            respond([])
        }
    }

}

import hibernate.example.Product

Product.list()*.name.each {
    println "Product name: >>>${it}<<<"
}

Product.getAll(1, 10, 22)*.name

// Dynamic finders
Product.findByName("Nokia Phone ver 9").name
Product.findByName("Nokia Phone ver 9").price
Product.findAllByNameLike("%Coffee%").name
def lenovo500 = Product.findAllByNameLikeAndPriceGreaterThan("%Len%", 500.00)
lenovo500.each { prod ->
    println "${prod.name}: ${prod.price}"
}    
    


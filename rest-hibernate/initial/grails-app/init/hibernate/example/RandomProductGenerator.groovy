package hibernate.example

class RandomProductGenerator {
    static Random random = new Random()
    static List<String> productBrands = ['Apple', 'Samsung', 'Google', 'Nokia', 'IBM', 'Lenovo']
    static List<String> productCategories = ['Phone', 'Computer', 'Laptop', 'CoffeeMaker', 'Automobile']

    static brandSize = productBrands.size()
    static catSize = productCategories.size()

    private int randomBrandIndex() { random.nextInt(brandSize) }

    private int randomCategoryIndex() { random.nextInt(catSize) }

    String randomBrand() { productBrands[randomBrandIndex()] }

    String randomCategory() { productCategories[randomCategoryIndex()] }

    String randomVersionNumber() { random.nextInt(20) }

    double randomPrice() {
        def price = 1000 * random.nextDouble()
        price = Math.round(price * 100)
        price = price / 100
    }

    Product newProduct() {
        def name = "${randomBrand()} ${randomCategory()} ver ${randomVersionNumber()}"
        def price = randomPrice()
        new Product(name: name, price: price)
    }
}


package hibernate.example

class BootStrap {


    def TDGEN = new RandomProductGenerator()

    def init = { servletContext ->
        100.times {
            TDGEN.newProduct().save()
        }

    }
    def destroy = {
    }





}

class CallingInterface: MyInterface, NewInterface {

    override fun hello() {
        println("Function hello is called is here")
    }

    override fun greeting() {
        println("New greeting can be given here")
    }

    override fun newMethod() {
        println("Function of new method")
    }
}
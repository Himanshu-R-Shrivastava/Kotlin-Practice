open class Animals(val legs: Int, var color: String) {

    fun eat() {
        println("I eat food")
    }

    fun sleep() {
        println("I sleep")
    }

    open fun sounds(){
        println("I make a sound")
    }
}
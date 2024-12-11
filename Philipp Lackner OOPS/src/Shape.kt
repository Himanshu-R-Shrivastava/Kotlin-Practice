abstract class Shape(var name: String) {

    constructor(name: String, vararg dimensions: Int) : this(name)

    init {
        println("I am the super class")
    }

    abstract fun area() : Double

    abstract fun perimeter(): Any

    fun changeName(newName: String) {
        name = newName
    }
}
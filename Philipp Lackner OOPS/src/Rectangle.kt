import kotlin.random.Random

class Rectangle(var a: Int, var b: Int) : Shape("Rectangle") {

    constructor(a: Int) : this(a, a) {
        println("This rectangle is a square")
    }

    constructor(a: Double, b: Double) : this(a.toInt(), b.toInt())

    companion object {
        fun randomRect(): Rectangle {
            val randomA = Random.nextInt(1, 10)
            val randomB = Random.nextInt(1, 15) // If I put randomA in place of (1, 15), this rectangle will be a square.
            return Rectangle(randomA, randomB)
        }
        fun randomSquare(): Rectangle {
            val randomA = Random.nextInt(1, 10)
            return Rectangle(randomA, randomA)
        }
    }

    init {
        println("$name created with a = $a and b = $b")
        println("$name perimeter is: ${perimeter()}")
    }

    override fun area() = a * b.toDouble()
    override fun perimeter() = 2 * a + 2 * b
    fun isSquare() = a == b

}
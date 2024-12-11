import kotlin.math.PI
import kotlin.random.Random

class NegativeRadiusException : Exception("The radius can't be negative. ")

class Circle internal constructor(val radius: Int) : Shape("Circle") {

    constructor(diameter: Double) : this((diameter / 2).toInt())  //If diameter is Int here same as radius then constructor overloading happens here

    companion object {
        fun randomCircle(): Circle {
            val randomRadius = Random.nextInt(1, 10)
            return Circle(randomRadius)
        }
    }

    init {
        if (radius < 0) {
            throw NegativeRadiusException()
        }
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = PI * radius * radius

    override fun perimeter() =
        2 * Constants.PI * radius  //Here I have to typecast pi to Int (pi.toInt()) which gives me inaccurate answer
}

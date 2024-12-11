import kotlin.math.cbrt
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println("Hello World!\n")
    println("\tI'm Himan")

    var myAge = 20
    val favoriteNumber = 3

    println("\nMy age is: $myAge")
    println("My favorite number is: $favoriteNumber\n")

    var x: Double = 4.0
    var y = 3

//Calculating squares, square root, qube and qube roots

    println(x.pow(y)) // Here 'x' should be Double or Float. But why?

    println("The cube root of $x is: " + sqrt(x.toDouble()))

    var z = 27
    println((z.toDouble().pow(1/3.toDouble()))) // Why it shows 1.0 as output when I remove .toDouble() from 1/3

    println("The cube root of $z is: " + cbrt(z.toDouble()))

    val q: Double = cbrt(125.0)
    println(q)

    println(x / y)
    println(y / x)

    var a = 6.6F
    var b = 9.4
    println(a + b)

    var c = 6.6
    var d = 9.4
    println(c + d) //a+b and c+d have to be same, but it is slightly different.

}
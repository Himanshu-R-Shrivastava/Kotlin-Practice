import kotlin.math.sqrt

fun main() {
    //val triangle1 = Triangle(3, 3, 4)
    Triangle(4, 4, 7)
}


class Triangle(val a: Int, val b: Int, val c: Int) {

    var p = a + b + c

    init {
        println("Triangle created with a = $a, b = $b and c = $c")
        triangleArea()
        trianglePerimeter()
    }

    fun triangleArea() {
        if (a + b > (c + 1) && a + c > b && b + c > a) {
            val area = sqrt((p / 2) * ((p / 2) - a) * ((p / 2) - b) * ((p / 2) - c).toDouble())
            println("Triangle area is: $area")
        } else println("This is not a valid triangle")
    }

    fun trianglePerimeter() {
        println("Triangle perimeter is: $p")
    }

}

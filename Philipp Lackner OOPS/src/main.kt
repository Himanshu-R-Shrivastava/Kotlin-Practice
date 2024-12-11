fun main() {

    val myRect = Rectangle(4, 7)
    println("Rectangle area is: ${myRect.area()}")
    println("Is Rectangle a square? ${myRect.isSquare()}")

    myRect.changeName("newRectangle")
    println("The name of the rectangle is: ${myRect.name}")

    val square: Rectangle = Rectangle(5)
    square.changeName("Square")
    println("Square area is: ${square.area()}")
    println("Is Rectangle a square? ${square.isSquare()}")

    val myCircle = Circle(5)
    myCircle.changeName("newCircle")
    println("The name of the circle is: ${myCircle.name}")

    val diaCircle = Circle(6.0)

    val myTriangle = Triangle(3.0, 4.0, 6.0)
    myTriangle.changeName("newTriangle")
    println("The name of the triangle is: ${myTriangle.name}")


    val rect = Rectangle(5)
    val circle = Circle(3)
    val triangle = Triangle(7.0, 7.0, 7.0)

    val maxAreaRectAndCircle = maxArea(rect, circle)
    val maxAreaRectCircleTriangle = maxArea(rect, circle, triangle)

    println("The maximum area of the circle and the rectangle is: $maxAreaRectAndCircle")
    println("The maximum area of the circle, the rectangle and the triangle is: $maxAreaRectCircleTriangle")


    val randomNewCircle = Circle.randomCircle()

    val randomNewRect = Rectangle.randomRect()  // This randomNewRect variable is not need to call randomRect()
    Rectangle.randomRect()                      // like this.
    val newRandomSquare = Rectangle.randomSquare()

// Anonymous Classes

    val a = 3
    val b = 4
    val height = 2

    var parallelogram = object : Shape("Parallelogram", a, b, height) {

        init {
            println("Parallelogram created with a = $a b = $b and height = $height")
            println("Area is: ${area()}")
            println("Perimeter is: ${perimeter()}")
        }

        override fun area(): Double {
            return (a * height).toDouble()
        }

        override fun perimeter(): Any {
            return 2 * a + 2 * b
        }

        fun isRectangle(): Boolean = height == b

    }
    println("Is the parallelogram is a rectangle? ${parallelogram.isRectangle()}")

// Anonymous Class 2

    val w = 3
    val x = 4
    val y = 5
    val z = 2
    val TropezeHeight = 3

    var trapeze = object : Shape("Trapeze", w, x, y, z, height) {

        init {
            println("Trapeze created with w = $w, x = $x y = $y, z = $z and height = $height")
            println("Area is: ${area()}")
            println("Perimeter is: ${perimeter()}")
        }

        override fun area(): Double {
            return ((w + y) * height / 2.0)
        }

        override fun perimeter(): Any {
            return w + x + y + z
        }

        fun isRectangle(): Boolean = w == y && x == z

    }
    println("Is the trapeze is a rectangle? ${trapeze.isRectangle()}")


// LAMBDA FUNCTIONS

    val circle1 = Circle(5)
    val circle2 = Circle(6.6)
    val triangle1 = Triangle(4.0, 4.0, 4.0)
    val triangle2 = Triangle(3.0, 3.0, 3.0)
    val rectangle1 = Rectangle(6)
    val rectangle2 = Rectangle(4.0, 3.0)

    println('\n')
    val integers = (1..10).toList().customFilter { it > 5 }
    println(integers)

//For Generic Class
    var triple = Triple<Int, String, Boolean>(3, "Hello", true) //We can remove <Int, String, Boolean>
    var customTriple = CustomTriple<Int, String, Boolean>(3, "Hello", true)
    customTriple.printTypes()

    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)
    for (shape in shapes) {
        println("${shape.name}: Area = ${shape.area()}")
    }
    println()

    shapes = shapes.filter { it.area() > 20 }.sortedBy { it.area() }
    for (shape in shapes) {
        println("${shape.name}: Area = ${shape.area()}")
    }

    shapes = shapes.customFilter { it.area() > 20 }.sortedBy { it.area() }
    for (shape in shapes) {
        println("${shape.name}: Area = ${shape.area()}")
    }
}

//Custom Lambda Function (Function extension)
/*fun List<Shape>.customFilter(filterFunction: (Shape) -> (Boolean)): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape)) {
            resultList.add(shape)
        }
    }
    return resultList
}*/

// GENERICS // (From Custom Lambda Function we give Shape a generic name 'T' in Generics, and we can declare <T : Shape> in the starting here.)
// Number in <T : Number> is super class of numbers like int, double, float etc
fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T> {   // we can write <Any> in place of <T> ?
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filterFunction(item)) {
            resultList.add(item)
        }
    }
    return resultList
}

fun maxArea(shape1: Shape, shape2: Shape): Double {
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Double {
    val maxAreaShape1Shape2 = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()
    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
    //return maxArea(maxArea(shape1, shape2), shape3)
}
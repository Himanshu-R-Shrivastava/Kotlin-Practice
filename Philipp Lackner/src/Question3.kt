import kotlin.math.pow

fun main() {
    println("Enter Number 1: ")
    var x = readln().toInt()
    println("Enter Number 2: ")
    var y = readln().toInt()

    println("The sum of x and y is: ${x.plus(y)}")

    var i = 1
    var result = 1

    while (i <= y) {
        result *= x
        i++
    }
    println("$x to the power of $y is: $result")


    println("$x to the power of $y is: ${x.toFloat().toDouble().pow(y).toInt()}")

}



/*fun main(args: Array<String>) {
    val base = 3
    var exponent = 4
    var result: Long = 1

    while (exponent != 0) {
        result *= base.toLong()
        --exponent
    }

    println("Answer = $result")
    println("$base raised to the power of $exponent is: $result")
}*/

// Method 3

/*
fun main(args: Array<String>) {
    val base = 3
    val exponent = 4
    val result = Math.pow(base.toDouble(), exponent.toDouble()) // It is a java method

    println("Answer = $result")
}*/

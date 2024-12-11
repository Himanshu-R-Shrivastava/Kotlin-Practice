package question1FunctionOverloading

fun main() {

    val division = try {
        divide(5, 0)
    } catch (e: DivisionByZero) {
        0
    }
    println("The result of division is: $division")


    println("Please enter a number: ")

    val input = try {
        readln().toInt()
    } catch (e: NumberFormatException) {    // I can write Exception in place of Exception coz NumberFormatException is a class of main class Exception.
        0
    } finally {
        println("This is from the finally block")
    }
    println("You entered: $input")

}

class DivisionByZero : Exception("You cannot divide by zero. Please choose a different number")

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw DivisionByZero()
    }
    return a / b
}
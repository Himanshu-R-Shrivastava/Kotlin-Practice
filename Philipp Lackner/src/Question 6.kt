// Calculate fibonacci series?numbers

fun main() {

// Method 1
/*    val list = mutableListOf(0, 1)
    println("Enter a number n > 1: ")
    val n = readln().toInt()

    if (n != null) {
        for (i in 2..n-1) {
            list.add(list[i-2] + list[i-1])
        }
    }
    println(list)*/

// Method 2
    val n = readln().toInt()
    var num1 = 0
    var num2 = 1
    for (i in 1..n) {

        println(num1)

        val sum = num1 + num2
        num1 = num2
        num2 = sum
    }
}
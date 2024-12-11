// Calculate sum of 5 numbers given by user

fun main() {

// Method 1

    println("Enter 5 numbers: ")

    var numberList = mutableListOf<Int>()

    for (i in 1..5) {
        numberList.add(readln().toInt())
    }
    var sum = 0

    println("Numbers entered by you are: $numberList")
    for (i in numberList) {
        sum += i
    }
    println("Sum of all the numbers in the list is: $sum")


// Method 2
    println("Enter 5 numbers: ")
    var sumOf5 = 0

    for (i in 1..5) {
        var input = readln().toInt()
        sumOf5 += input
    }

    println("Sum of your 5 number is: $sumOf5")


// Method 3
    println("Enter 5 numbers: ")
    var sumOfAll = 0
    for (i in 1..5) {
        var input = readLine()?.toInt()
        if (input != null) {
            sumOfAll += input
        }
    }
    println("Sum of your 5 numbers is: $sumOfAll")


// Calculate average value of 5 numbers given by user
    println("Enter 5 numbers: ")
    var avg = 0.0
    for (i in 1..5) {
        var input = readLine()?.toInt()
        if (input != null) {
            avg += input / 5.0
        }
    }
    println("The average value is $avg")
}
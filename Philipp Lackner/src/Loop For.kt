fun main() {

/*    for (i in 'a'..'z') {
        println(i)
    }

    println()
    print('\n')

    for (i in 'A'..'Z') {
        println(i)
    }*/


    val myArray = arrayOf(2, 4, 5, 7, 0, 9, 3, 6, 1, 8)
    var max = myArray[0]

    for (item in myArray) {     // item = i = iterator
        if (item > max) {
            max = item
        }
    }
    println("largest number is the array is: $max")


// Sum of the array

    var sum = 0
    for (i in myArray) {
        sum += i
    }
    println("Sum of all the element in the array is: $sum")

}
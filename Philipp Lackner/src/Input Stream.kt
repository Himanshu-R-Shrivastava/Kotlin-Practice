fun main() {
    println("You entered: ${readln()}")

    val userInput = readLine()
    if (userInput != null) {
        println(userInput.toInt() - 5)
    }
//    else if (userInput == String) {
//        println("You entered non-integer that is characters or symbols")
//    }

}
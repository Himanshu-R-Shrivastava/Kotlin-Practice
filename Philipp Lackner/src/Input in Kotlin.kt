fun main() {

    var userInput = readln()    // readln() give result in of String type
    println("You entered: '$userInput'")
    println("Your input in capital letters: ${userInput.uppercase()}")

    val userInput2/* : String? */ = readLine()    // readline() is a nullable receiver of type String?
    println("You entered: $userInput2")
    println("Your input in capital letters: ${userInput2?.uppercase()}")

    val userInput3 = readlnOrNull()
    println("You entered: $userInput3")
    println("Your input in capital letters: ${userInput3?.uppercase()}")


    println("You entered: ${readln()}")

}

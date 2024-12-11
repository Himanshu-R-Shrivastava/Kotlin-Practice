fun main() {

    val myArray = arrayOf("Hello", "Guys", "Whats up?")

    val arrayLenght = myArray.size

//    var i = 0
//    while (i < arrayLenght) {
//        println(myArray[i])
//        i++
//    }

    for (i in 0..<arrayLenght) {    // until = <
        println(myArray[i])
    }
}
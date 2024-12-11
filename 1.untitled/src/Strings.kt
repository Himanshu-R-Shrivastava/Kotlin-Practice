import java.util.*


fun main() {
    var string1 = "This is a string."

    //String Functions

    //Function 1
    println(string1.length)

    val stringLength = string1.length
    println(stringLength)

    //Function 2
    val stringIndex = string1.get(5)
    println("The character at index 5 is: ")
    println(stringIndex)

    println("The character at index 5 is: ${string1.get(5)}")

    println(string1[5])

    //Function 3
    println(string1.subSequence(0, 10))

    //Function 4
    println(string1.substring(10, 17))

    //Function 5
    println(string1.isEmpty())
    println(!string1.isEmpty())
    println(string1.isNotEmpty())

    println(string1.isBlank())
    println(!string1.isBlank())
    println(string1.isNotBlank())

    //some other functions
    println(string1.uppercase())
    println(string1.lowercase())
    println(string1.capitalize())
    println(string1.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
    println(string1.decapitalize())
    println(string1.replaceFirstChar { it.lowercase(Locale.getDefault()) })

    println(string1.reversed())

}
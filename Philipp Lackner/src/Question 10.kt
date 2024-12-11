// VARARG, DEFAULT AND NAMED PARAMETERS/ARGUMENTS

fun main() {
    val myArray = intArrayOf(11, 12, 13, 14, 18, 17, 16, 15)
    val max = getMax(1, 3, 3, 4, 5, 2, *myArray, 1, 9, 6, 0, 8)
    println("The maximum is: $max")     //First 2 max variable can be changed

    searchFor("How to become good programmer")      //Here we haven't changed the default parameter("Google")
    searchFor("How to become the best kotlin programmer", "Bing")   //Here we changed the default parameter to "Bing"
    searchFor(searchEngine = "DuckDuckGo", search = "How to be the best Android developer")     //Named Argument
}

fun searchFor(search: String, searchEngine: String = "Google") {    //Default Parameter
    println("Searching for '$search' on $searchEngine")
}

fun getMax(vararg numbers: Int): Int {          //Vararg Parameter
    var max = numbers[0]        // var max = 0
    for (number in numbers) {        // i == number == numbers
        if (number > max) {
            max = number
        }
    }
    return max
}

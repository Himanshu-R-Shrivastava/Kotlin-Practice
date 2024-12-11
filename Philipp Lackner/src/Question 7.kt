fun main() {

    print("ENTER YOUR AGE: ")
    val age = readln().toInt()

    when (age) {
        in 0..5 -> println("Your are a young kid")
        in 6..17 -> println("You are  teenager")
        18 -> println("Finally! you are 18!")
        19, 20 /*in 19..20*/ -> println("You are a young adult")
        in 21..65 -> println("You are an adult")
        else -> println("You are really really old")
    }


    println("Enter your country name: ")
    val country = readln()

    when (country) {
        ("India") -> println("Namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        "Russia" -> println("Privet")
        else -> println("I don't know your country :(")
    }

}
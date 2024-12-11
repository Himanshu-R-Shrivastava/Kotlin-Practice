fun main() {
//Declare a variable and check if it lies within a specific range.
    val a= 17

    //method 1 using if-else ladder and logical operator
    if(a>=1 && a<=10) println("Between 1 to 10")
    else if(a>=11 && a<=20) println("Between 11 to 20")
    else if(a>=21 && a<=30) println("Between 21 to 30")
    else println("Not between 1 to 30")

    //method 2 using when expression and in keyword
    when(a){
        in 1..10 -> println("Between 1 to 10")
        in 11..20 -> println("Between 11 to 20")
        in 21..30 -> println("Between 21 to 30")
        else -> println("Not between 1 to 30")
    }

}
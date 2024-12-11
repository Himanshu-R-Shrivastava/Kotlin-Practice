/*fun main() {

    print("Please enter your age: ")
    val age = readln().toInt()

    if (age < 18) {
        println("You are not adult yet")
    }
    else if (age <= 65) {
        println("You are an adult")
    }
    else {
        println("You are really really old")
    }
}*/

fun main() {

    print("Please enter your age: ")
    val age = readln().toInt()

    if(age != null){
        if (age >= 0 && age < 18) {        // if (age in 0..18)
            println("you are not an adult")
        }
        else if (age in 19..65) {   // else if (age > 18 && age <= 65)
            println("Your are an adult")
        }
        else {
            println("You are really really old")
        }
    }
    //else { }

}
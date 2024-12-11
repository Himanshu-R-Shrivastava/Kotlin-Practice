//Primary Constructor

class Dogs(var breed: String, var color: String, var age: Int) {

    fun eat(){
        println("${breed}s eat.")
    }

    fun bark() {
        println("${breed}s bark.")
    }
}

fun main() {

    val dog1 = Dogs("Labrador", "Black", 2)    //Here dog1 is an object of the class Dogs
    val dog2 = Dogs( "German Shepherd", "Brown", 3) ////Here dog2 is second object of the class Dogs

    dog1.eat()
    dog1.bark()
    println("The breed of the dog is ${dog1.breed} whose color is ${dog1.color} and is ${dog1.age} years old.")

    dog2.eat()
    dog2.bark()
    println("The breed of the dog is ${dog2.breed} whose color is ${dog2.color} and is ${dog2.age} years old.")
}
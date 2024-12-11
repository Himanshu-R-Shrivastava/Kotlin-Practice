import java.util.Arrays

//How to use Primary Constructor and Secondary Constructor together

class Doggies(var breed: String, var color: String, var age: Int) {

    var name: String? = null

    constructor(breed: String, color: String, age: Int, name: String): this(breed, color, age) {
        this.name = name
    }
}

fun main () {
    val dog1 = Doggies("Labrador", "Black", 1)
    val dog2 = Doggies("German Shepher", "Brown", 4, "Tojo")
    println(dog1)
}
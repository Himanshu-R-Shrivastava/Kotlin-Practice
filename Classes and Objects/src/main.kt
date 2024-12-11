fun main() {

    val res1 = Restaurants("LcD", 4.4, 240)
    val res2 = Restaurants("Pominoes", 4.0, 250)
    val res3 = Restaurants("Sugar King", 4.5, 450)
    val res4 = Restaurants("Maco Bell", 3.5, 200)
    val res5 = Restaurants("Hubway", 3.9, 300)

    val res6 = Restaurants("Maco Bell", 3.5, 200)

    var restaurantList = mutableListOf(res1, res2, res3, res4)

    restaurantList.add(res5)
    println(restaurantList)

    for(res in restaurantList){
        println(res)
    }


    if (res4==res6) println("Same")
    else println("Different")

}
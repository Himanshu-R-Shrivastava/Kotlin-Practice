fun main(){

    var nullvalue: String? = null

    println(nullvalue)
    println(nullvalue?.length)                      // ?. = safe call
    println(nullvalue?.length ?: "This is null")    // ?: = Elvis operator


    val listWithNull = listOf(1,null,2,3,null,4,5)
    val arrayListWithNull = arrayListOf("This",null, "is", "a", null,  "null", "statement")

    println("The list without the null value is: ${listWithNull.filterNotNull()}")
    println("The array list without the null value is: ${arrayListWithNull.filterNotNull()}")

}
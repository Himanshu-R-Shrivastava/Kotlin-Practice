// Extension Function

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println("The product of $list is: ${list.product()}")   //Here function is called using a variable

}

fun List<Int>.product(): Int {
    var pro = 1
    for (i in this) {   // i == value, this == list
        pro *= i
    }
    return pro
}
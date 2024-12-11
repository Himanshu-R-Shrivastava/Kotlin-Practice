package question1FunctionOverloading


fun main() {
    var list = (1..10).toList()
    val sum = list.customSum { it % 2 == 1 }
// 1 + 3 + 5 + 7 + 9 = 25
    println("The sum is: $sum")
}

fun List<Int>.customSum(sumFunction: (Int) -> (Boolean)): Int {
    var resultSum = 0
    for (item in this) {
        if (sumFunction(item)) {
            resultSum += item
        }
    }
    return resultSum
}
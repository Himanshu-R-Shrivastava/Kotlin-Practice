package question1FunctionOverloading

fun main() {

    var list = (1..20).toList()
    println(list)

    var list1 = list.filter { it % 2 == 0 }
    println(list1)

    list = list.filter { it % 2 != 0 }
    println(list)

    list = list.filter { it > 8 }
    println(list)
}
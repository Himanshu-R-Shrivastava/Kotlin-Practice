package question1FunctionOverloading

fun main() {

    val list = listOf(1, 2, 3, 4, 5)
    val array = arrayOf(2, 4, 6, 8, 10, 12)

    println("List: $list")
    printAlternatively(list)

    println("array: ${array.contentToString()}")    //Arrays.toString(array) replaced with array.contentToString()
    printAlternatively(array)

}

fun printAlternatively(list: List<Int>) {

    var i = 0
    var j = list.size - 1
    var toggle = true

    while (i <= j) {
        if (toggle) {
            println(list[i])
            i++
        } else {
            println(list[j])
            j--
        }
        toggle = !toggle
    }
}

fun printAlternatively(array: Array<Int>) {

    var i = 0
    var j = array.size - 1
    var toggle = true

    while (i <= j) {
        if (toggle) {
            println(array[i])
            i++
        } else {
            println(array[j])
            j--
        }
        toggle = !toggle
    }
}
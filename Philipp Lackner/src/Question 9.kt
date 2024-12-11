fun main() {
    val myList = listOf(3, 2, 5, 1, 5, 6, 7)
    println("The list looks like the following: $myList")
//   val index = indexOf(listOf(3,44,4,5,), 4)
    println("Search for this number: ")
    val input = readLine()?.toInt()
    if (input != null) {
        println("The index of $input is: ${indexOf(myList, input)}")
    }
}

fun indexOf(mList: List<Int>, value: Int): Int {
    for (i in mList.indices) {        // for (i in myList.indices) ==  for (i in 0..myList.size-1) ==  for (i in 0 until myList.size) == for (i in 0.. < myList.size)
        if (mList[i] == value) {
            return i
        } // else continue
    }
    return -1
}
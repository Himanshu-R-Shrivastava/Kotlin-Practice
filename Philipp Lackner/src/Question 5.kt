//Kotlin Newbie To Pro - LISTS- Part 14 by Philipp Lackner
fun main () {
    var list1 = mutableListOf<Int>()

    for (i in 1..5) {
        val x = readLine()?.toInt()
        if (x != null) {
            list1.add(x)
        }
    }

    //println(list1.reverse())    // reverse() and asReversed() work same here

    for (i in 5 downTo 1) {     // for (i in list1.size-1 downTo 0) { println(list[i]) }
        println(i)
    }
}
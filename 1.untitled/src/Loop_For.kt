fun main() {

    for (b in 1..10){       //Here b is a iterator
        println(b)
    }

    arrayTraversing()
}



fun arrayTraversing() {

    val array1 = arrayOf ('a','b','c','d','e','f')

    // for (i in 0..array1.size-1)
    // for (i in 0 until array1.size)
    for (i in 0..<array1.size){
        println(array1[i])
    }
}

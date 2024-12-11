fun main () {

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    var j = 10
    while (j>0){
        println(j)
        j--
    }

    var k = 10
    do {
        println(k)
        k--
    } while (k>0)
}
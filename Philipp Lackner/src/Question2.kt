fun main() {

    println("Enter a Number: ")
    var num = readln().toInt()

    /*if (num != null) {
        var i = 0
        while (i <= num) {
            println(i)
            i++
        }
    }*/

    if (num != null) {
        var i = num
        while (i >= 0) {
            println(i)
            i--
        }
    }

}
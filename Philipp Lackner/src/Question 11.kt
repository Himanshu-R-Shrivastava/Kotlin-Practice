fun main() {
    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum is: $sum")
}
// Method 1
/*fun alternatingSum(vararg numbers: Int): Int {
    var x = 0
    for (i in 0..<numbers.size) {
        if (i%2 == 0) {
            x += numbers[i]
        }
        else {
            x -= numbers[i]
        }
    }
    return x
}*/

// Method 2
fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true
    for (number in numbers) {
        if (toggle) {
            sum += number
        }
        else {
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}
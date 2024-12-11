fun main() {
    val c = sum(10,5)
//    val d = difference(6, 2)
    val e = division(20,5)

    println(c)
    println(e)

    val pro = Product()
//    pro.product(9,3)
}

class Product(){
    protected fun product(a: Int, b: Int) = a * b
}
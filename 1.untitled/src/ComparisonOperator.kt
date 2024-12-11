fun main(){
    val a= 12.5
    val b= 3.5
    var result: Boolean

    result = a==b
    println(result)

    result = a!=b
    println(result)

    result = a>b
    println(result)

    result = a<b
    println(result)

    result = a>=b
    println(result)

    result = a<=b
    println(result)

    println(a == b)     /* assignment operators always give result/output in boolean value. So we compare two number like this
    as well as using if-else statement. */
    println(a != b)
    println(a < b)
    println(a > b)
    println(a <= b)
    println(a >= b)

    val x = 5
    val y = 5
    println(a==b && x==y)
    println(a==b || x==y)
    println(a==b || !(x==y))
    println(!(a==b && x==y))
    println(a==b || x==y && b > y)  // Here && has high presidency than ||
    // If you want to calculate || first then put than statement into parenthesis
    println((a==b || x==y) && b > y)


    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println("The result of simpleExpression is: $simpleExpression")
    val bool = true
    val j = 9
    val k = 3
    val l = 9
    val hardExpression = !(j != l) && bool || l > (j + k) && (!bool || k < l)
    println("The result of hardExpression is: $hardExpression")

}
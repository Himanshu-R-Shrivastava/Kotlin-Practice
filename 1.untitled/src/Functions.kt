fun main(){

    newFunction()

    println(timesTwo(35))
    
}

/*fun newFunction(){
    println("This is a new function.")*/

fun newFunction() = println("This is a new function.")


/*
fun timesTwo(x: Int): Int {
//    var output = x * 2
//    return output

    return x * 2
}*/

fun timesTwo(x: Int) = x * 2
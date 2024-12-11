fun main(){
    val a= 10
    val b= 5

//    if(b!=0){
//        println(a/b)
//    } else println("'a' cannot be divided")

    if(b==0){
        println("Division cannot be performed")
    }
    else{
        println(a/b)
    }

    var c = if (a > b || a * a == 25) 13 else 14
    println(c)

}
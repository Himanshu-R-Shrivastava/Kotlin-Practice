fun main(){

    val x = 0

    if(x>0 || x<0){
        println("It is a non-Zero number")
    } else println("It is Zero")


    val a= 12.5
    val b= 3.5
    val y = 5
    val z = 5
    println(a==b && y==z)
    println(a==b || y==z)
    println(a==b || !(y==z))
}
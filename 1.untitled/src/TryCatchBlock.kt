import java.lang.IndexOutOfBoundsException

fun main(){
    val arr = arrayOf(1,2,3,4,5)

    try {
        arr[5]= 7
        println("I ran and changed the value")
    } catch (e: IndexOutOfBoundsException){
        println("I ran and caught the exception")
    } //finally { }

    println(arr[3])
}
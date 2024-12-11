import java.util.Arrays

fun main(){
    var array1 = arrayOf("This", "is", 'a', "string", "array")
    println(array1[3])

    array1[3] = "new string"
    println(array1[3])

    println(array1.size)

    println(Arrays.toString(array1))
}
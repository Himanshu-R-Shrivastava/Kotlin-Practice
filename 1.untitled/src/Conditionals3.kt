fun main(){

    val a= 10
    val b= 15

/*    val maxValue: Int

    if(a>b){
        maxValue= a
    }
    else maxValue= b*/


    val maxValue:Int = if(a>b) {
        a
    }
    else b

    println(maxValue)
}
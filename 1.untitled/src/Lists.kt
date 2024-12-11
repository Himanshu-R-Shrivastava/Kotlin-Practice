fun main (){

//Immutable List
    var list1 = listOf ("Box", "Table", "Chair")
    println(list1)
//    list1[1] = "Bed"    //We can't change elements in immutable list


//Mutable List
    val list2 = mutableListOf("Box", "Table", "Chair")
    println(list2)

    list2[1]= "Bed"
    list2.add("TV")
    list2.add(2,"AC")
    println(list2)

    list2.removeAt(3)
    println(list2)

    val array1 = arrayOf("Fan", "Light", "Cooler")
    list2.addAll(array1)
    println(list2)

//Array List in Kotlin
    val arrayList1 = arrayListOf("Pen", "Pencil", "Eraser")
    println(arrayList1)
    list1 = arrayList1
    println(list1)
}
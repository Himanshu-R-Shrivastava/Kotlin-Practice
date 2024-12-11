fun main() {

    val linda = Person("Linda", 33, doesSmile = true)

    println(linda.description())

    println(linda.hadBirthday())
    println(linda.description())

}

class Person(private var name: String, private var age: Int, doesSmile: Boolean) {

    private var nickname: String

    init {
        var smiley = if(doesSmile) ":)" else ":("
        nickname = name + smiley    // "$name $smiley"
    }

    fun description(): String {
        return "Name: $nickname, Age: $age"
    }

    fun hadBirthday() {
        age += 1
    }
}
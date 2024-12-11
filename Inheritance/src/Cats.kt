class Cats(legs: Int, color: String) : Animals(legs, color) {

    override fun sounds() {
        println("I purr")
    }
}
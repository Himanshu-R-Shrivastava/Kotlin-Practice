fun main() {

    println(BankAccount.TAG)

    repeat(4) {
        println(BankAccount.create("Rahul Pandey"))
    }

}

class BankAccount(private val name: String) {
    companion object{
        const val TAG = "BankAccount"
        var nextId = 1

        fun create(name: String): BankAccount? {
            val instance = BankAccount(name)
            return if (instance.validateIdentity()) instance else null
        }
    }

    fun validateIdentity(): Boolean {
        //Check their government Id
        return true     //sending true as of now
    }

    private val accountId: Int
    init {
        accountId = nextId++
    }

    override fun toString(): String {
        return "$TAG with account Id $accountId having name $name"
    }

}
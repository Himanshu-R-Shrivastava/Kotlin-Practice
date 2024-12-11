private const val SALARY_THRESHOLD = 100
private val taxCollector = TaxCollector()
private val accountant by lazy {
    Accountant()
}

fun main() {
    val salaries = listOf(50, 110, 70)
    for (salary in salaries) {
        taxCollector.payTaxes(salary)
        if (salary > SALARY_THRESHOLD) accountant.findTaxSavings()
    }
}

class TaxCollector() {
    init {
        println("init tax collector")
    }
    fun payTaxes(salary: Int) = println("Paying taxes on salary of ${salary} ...")
}

class Accountant() {
    init {
        println("init accountant - This is hard work!")
    }
    fun findTaxSavings() = println("\t Found tax savings!")
}
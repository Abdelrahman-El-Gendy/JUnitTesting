import kotlin.math.abs

fun main() {

    runChecks()
}


fun hasDuplicatesIgnoreSign(numbers: List<Int>): Boolean {
    val seen = mutableListOf<Int>()
    numbers.forEach { currentNumber ->
        val ignoredSignNumber = abs(currentNumber)
        if (ignoredSignNumber in seen) {
            return true
        }
        seen.add(ignoredSignNumber)
    }
    return false
}


fun sum(firstNumber: Int, secondNumber: Int) = firstNumber + secondNumber

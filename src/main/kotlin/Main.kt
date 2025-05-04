import kotlin.math.abs

fun main() {

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
fun isEvenOrNull(number: Int): Int? = if (number % 2 == 0) number else null
fun divide(dividend: Int, divisor: Int): Int {
    return dividend / divisor
}
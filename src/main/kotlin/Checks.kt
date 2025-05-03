fun runChecks() {
    check(
        "when have a list with positive and negative duplicates ignoring sign it should return true",
        result = hasDuplicatesIgnoreSign(listOf(1, 2, -2, 3, 4)),
        correctResult = true
    )
    check(
        "when have a list with no duplicates ignoring sign it should return false",
        result = hasDuplicatesIgnoreSign(listOf(-1, 2, 3, 4, 5)),
        correctResult = false
    )
    check(
        "when have a list with large positive and negative duplicates ignoring sign it should return true",
        result = hasDuplicatesIgnoreSign(
            listOf(10, -10, 20, -20, 30)
        ),
        correctResult = true
    )

    check(
        "when have a list with multiple duplicates ignoring sign it should return true",
        result = hasDuplicatesIgnoreSign(listOf(5, -5, 5, -5)),
        correctResult = true
    )
    check(
        "when have a list with a single element it should return false",
        result = hasDuplicatesIgnoreSign(listOf(10)),
        correctResult = false
    )
    check(
        "when have an empty list it should return false",
        result = hasDuplicatesIgnoreSign(listOf()),
        correctResult = false
    )
    check(
        "when have a list with all elements identical ignoring sign it should return true",
        result = hasDuplicatesIgnoreSign(listOf(1, -1, 1, -1)),
        correctResult = true
    )
    check(
        "when have a list with zero duplicates it should return true",
        result = hasDuplicatesIgnoreSign(
            listOf(0, 1, 2, 0)
        ),
        correctResult = true
    )

    check(
        "when have a list with zeros only it should return true",
        result = hasDuplicatesIgnoreSign(listOf(0, 0, 0)),
        correctResult = true
    )
}

fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Check: $name result: $result is correct")
    } else {
        println("Check: $name result: $result is incorrect")
    }
}
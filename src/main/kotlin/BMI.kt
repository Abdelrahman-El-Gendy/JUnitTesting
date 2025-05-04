class IllegalWeightInput : IllegalArgumentException("Weight should be a positive number > 0")

class IllegalHeightInput : IllegalArgumentException("Height should be a positive number > 0")

fun calculateBodyMassIndex(weight: Double, height: Double): Double {
    if (weight <= 0) throw IllegalWeightInput()
    if (height <= 0) throw IllegalHeightInput()
    return weight / (height * height)
}

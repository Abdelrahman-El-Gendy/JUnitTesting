import com.google.common.truth.Truth.assertThat
import kotlin.test.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.runners.Parameterized

class BMIKtTest {

    @Test
    fun `should throw IllegalWeightInput when weight is zero`() {
        //Given
        val height = 1.75
        val weight = 0.0
        //When & Then
        assertThrows<IllegalWeightInput> { calculateBodyMassIndex(weight, height) }
    }

    @Test
    fun `should throw IllegalWeightInput when weight is negative`() {
        //Given
        val height = 1.75
        val weight = -50.0
        //When & Then
        assertThrows<IllegalWeightInput> { calculateBodyMassIndex(weight, height) }
    }

    @Test
    fun `should throw IllegalWeightInput when height is zero`() {
        //Given
        val height = 0.0
        val weight = 50.0
        //When & Then
        assertThrows<IllegalHeightInput> { calculateBodyMassIndex(weight, height) }
    }

    @Test
    fun `should throw IllegalWeightInput when height is negative`() {
        //Given
        val height = -1.75
        val weight = 50.0
        //When & Then
        assertThrows<IllegalHeightInput> { calculateBodyMassIndex(weight, height) }
    }

    /**
    @Test
    fun `should return correct value for under weight when input are correct`() {
    //Given
    val height = 1.75
    val weight = 50.0
    //When
    val bmiResult = calculateBodyMassIndex(weight, height)
    //Then
    assertThat(bmiResult).isWithin(0.01).of(16.32)
    }

    @Test
    fun `should return correct value for normal weight when input are correct`() {
    //Given
    val height = 1.75
    val weight = 65.0
    //When
    val bmiResult = calculateBodyMassIndex(weight, height)
    //Then
    assertThat(bmiResult).isWithin(0.01).of(21.22)
    }

    @Test
    fun `should return correct value for over weight when input are correct`() {
    //Given
    val height = 1.75
    val weight = 80.0
    //When
    val bmiResult = calculateBodyMassIndex(weight, height)
    //Then
    assertThat(bmiResult).isWithin(0.01).of(26.12)
    }
     **/
    @ParameterizedTest
    @CsvSource(
        "1.75, 50.0, 16.32",
        "1.75, 65.0, 21.22",
        "1.75, 80.0, 26.12"
    )
    fun `should return true when all inputs are correct`(height: Double, weight: Double, expectedBmi: Double) {
        //When
        val bmiResult = calculateBodyMassIndex(weight, height)
        //Then
        assertThat(bmiResult).isWithin(DELTA).of(expectedBmi)

    }

    companion object {
        private const val DELTA = 0.01
    }

}
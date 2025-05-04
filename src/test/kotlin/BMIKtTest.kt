import com.google.common.truth.Truth.assertThat
import kotlin.test.Test
import org.junit.jupiter.api.assertThrows

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

}
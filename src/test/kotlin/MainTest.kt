import com.google.common.truth.Truth.assertThat
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test

class MainTest {


    @Test
    fun checkSum() {
        val actual = sum(1, 2)
        assertEquals(3, actual)
    }

    @Test
    fun `should Return True when List Has The Same NumbersId Different Signs`() {
        //Give
        val input = listOf(1, 2, -2, 3, 4)
        //when
        val result = hasDuplicatesIgnoreSign(input)
        //then
//        assertTrue(result)
//        assertEquals(true, result)
//        result shouldBe true
        assertThat(result).isTrue()
    }

    @Test
    fun `should return false when list has no duplicates ignoring sign`() {
        //Given
        val input = listOf(-1, 2, 3, 4, 5)
        //when
        val result = hasDuplicatesIgnoreSign(input)
        //then
        assertEquals(false, result)
    }

    @Test
    fun `should return true when list has large positive and negative duplicates ignoring sign`() {
        //Given
        val input = listOf(10, -10, 20, -20, 30)
        //when
        val result = hasDuplicatesIgnoreSign(input)
        //Then
        assertEquals(true, result)
    }

    @Test
    fun `should return true when list has multiple duplicates ignoring sign`() {
        val input = listOf(5, -5, 5, -5)
        val result = hasDuplicatesIgnoreSign(input)
        assertEquals(true, result)
    }

    @Test
    fun `should return false when list has a single element`() {
        val input = listOf(10)
        val result = hasDuplicatesIgnoreSign(input)
        assertEquals(false, result)

    }

    @Test
    fun `should return false when list is empty`() {
        val actual = hasDuplicatesIgnoreSign(listOf())
        assertEquals(false, actual)
    }

    @Test
    fun `should return true when list has all elements identical ignoring sign`() {
        val input = listOf(1, -1, 1, -1)
        val result = hasDuplicatesIgnoreSign(input)
        assertEquals(true, result)
    }

    @Test
    fun `should return true when list has zero duplicates`() {
        val input = listOf(0, 1, 2, 0)
        val result = hasDuplicatesIgnoreSign(input)
        assertEquals(true, result)
    }

    @Test
    fun `should return true when list contains only Zeros`() {
        val input = listOf(0, 0, 0)
        val result = hasDuplicatesIgnoreSign(input)
        assertEquals(true, result)
    }

    @Test
    fun `should return null when the number is odd`() {
        //Given
        val number = 5
        //When
        val result = isEvenOrNull(number)
        //Then
        assertThat(result).isNull()
    }

    @Test
    fun `should throw Arithmetic exception when the divisor equal zero`() {
        //Given
        val dividend = 2
        val divisor = 0
        //When & Then
        assertThrows<ArithmeticException>() { divide(dividend, divisor) }

    }
}
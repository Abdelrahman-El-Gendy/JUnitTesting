import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MainTest {


    @Test
    fun checkSum() {
        val actual = sum(1, 2)
        assertEquals(3, actual)
    }


//    @Test
//    fun checkPositiveAndNegative() {
//        val actual = hasDuplicatesIgnoreSign(listOf(1, 2, -2, 3, 4))
//        assertEquals(true, actual)
//    }

    @Test
    fun `should Return True when List Has The Same NumbersId Different Signs`() {
        //Give
        val input = listOf(1, 2, -2, 3, 4)
        //when
        val result = hasDuplicatesIgnoreSign(input)
        //then
        assertEquals(true, result)
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

}
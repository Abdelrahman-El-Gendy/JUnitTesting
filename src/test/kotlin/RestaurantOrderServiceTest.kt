import com.google.common.truth.Truth.assertThat
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RestaurantOrderServiceTest {
    lateinit var restaurantOrderService: RestaurantOrderService
    val database: Database = mockk(relaxed = true)
    val uiMassage: UiMassage = mockk(relaxed = true)

    @BeforeEach
    fun setUp() {
        val dummyLogger: Logger = mockk()
        restaurantOrderService = RestaurantOrderService(
            dummyLogger,
            database = database,
            uiMassage = uiMassage
        )
    }

//    @Test
//    fun `should add valid order successfully when addOrder method called with valid order`() {
//        //Given
//        val order = "Tomato"
//        //When
//        restaurantOrderService.addOrder(order)
//        //Then
//        assertThat(restaurantOrderService.getOrders().contains(order))
//    }

    @Test
    fun `clearOrders should clear all orders from database when called`() {
        //When
        restaurantOrderService.clearOrders()
        //Then
        verify { database.deleteAllOrders() }
    }

    @Test
    fun `addOrder should return success message when order added into database successfully`() {
        //Given
        every { database.insertOrder(any()) } returns Result.success("Success")
        //When
        restaurantOrderService.addOrder("Tomato")
        //Then
        verify { uiMassage.showMessage("Success") }
    }

    @Test
    fun `addOrder should return fail message when order not added to database`() {
        //Given
        every { database.insertOrder(any()) } returns Result.failure(Exception())
        //When
        restaurantOrderService.addOrder("Tomato")
        //Then
        verify { uiMassage.showMessage("Fail") }
    }
}

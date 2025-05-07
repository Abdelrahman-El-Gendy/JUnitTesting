import com.google.common.truth.Truth.assertThat
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RestaurantOrderServiceTest {
    lateinit var restaurantOrderService: RestaurantOrderService
    val database: Database = mockk(relaxed = true)

    @BeforeEach
    fun setUp() {
        val dummyLogger: Logger = mockk()
        restaurantOrderService = RestaurantOrderService(dummyLogger, database)
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
}
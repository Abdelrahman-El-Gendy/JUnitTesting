import org.koin.core.logger.MESSAGE

class RestaurantOrderService(
    private val logger: Logger,
    private val database: Database
) {
    private val orders = mutableListOf<String>()
    fun addOrder(order: String) {
        if (order.isBlank()) {
            logger.log("Order cannot be empty")
            throw IllegalArgumentException()
        }
        val insertOrderResult = database.insertOrder(order)
        when {
            insertOrderResult.isSuccess -> showMessage("Success")
            insertOrderResult.isFailure -> showMessage("Fail")
        }
    }

    fun showMessage(message: String) {
        print(message)
    }

    fun getOrders(): List<String> = orders.toList()

    fun clearOrders() {
        logger.log("Clearing all orders")
        database.deleteAllOrders()
        orders.clear()
    }
}
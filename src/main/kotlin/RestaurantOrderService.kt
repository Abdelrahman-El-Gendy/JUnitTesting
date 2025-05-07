import org.koin.core.logger.MESSAGE

class RestaurantOrderService(
    private val logger: Logger,
    private val database: Database,
    private val uiMassage: UiMassage
) {
    private val orders = mutableListOf<String>()
    fun addOrder(order: String) {
        if (order.isBlank()) {
            logger.log("Order cannot be empty")
            throw IllegalArgumentException()
        }
        val insertOrderResult = database.insertOrder(order)
        when {
            insertOrderResult.isSuccess -> uiMassage.showMessage("Success")
            insertOrderResult.isFailure -> uiMassage.showMessage("Fail")
        }
    }


    fun getOrders(): List<String> = orders.toList()

    fun clearOrders() {
        logger.log("Clearing all orders")
        database.deleteAllOrders()
        orders.clear()
    }
}
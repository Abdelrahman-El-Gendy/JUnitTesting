class RestaurantOrderService(
    private val logger: Logger
) {
    private val orders = mutableListOf<String>()
    fun addOrder(order: String) {
        if (order.isBlank()) {
            logger.log("Order cannot be empty")
            throw IllegalArgumentException()
        }
        orders.add(order)
    }

    fun getOrders(): List<String> = orders.toList()

    fun clearOrders() {
        logger.log("Clearing all orders")
        orders.clear()
    }
}
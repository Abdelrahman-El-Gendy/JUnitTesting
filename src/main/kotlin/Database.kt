interface Database {

    fun quaryOrders(): List<String>
    fun deleteAllOrders()
    fun insertOrder(order: String):Result<String>
}
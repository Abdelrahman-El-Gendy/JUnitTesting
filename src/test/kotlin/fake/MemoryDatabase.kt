package fake

import Database

class MemoryDatabase : Database {
    val inMemoryDatabase = mutableListOf<String>()
    override fun quaryOrders(): List<String> {
        return inMemoryDatabase.toList()
    }

    override fun deleteAllOrders() {
        inMemoryDatabase.clear()
    }

    override fun insertOrder(order: String): Result<String> {
        inMemoryDatabase.add(order)
        return Result.success("$order added successfully")
    }
}
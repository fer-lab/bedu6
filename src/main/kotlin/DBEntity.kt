abstract class DBEntity {
    abstract fun add()
    abstract fun addBefore()
    abstract fun addAfter()
    abstract fun save(id: String)
    abstract fun saveBefore(id: String)
    abstract fun saveAfter(id: String)
    abstract fun delete(id: String)
    abstract fun deleteBefore(id: String)
    abstract fun deleteAfter(id: String)

}
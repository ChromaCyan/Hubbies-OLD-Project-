package com.example.pchub.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.pchub.dao.Product

@Dao
interface ProductDao {
    @Insert
    fun insertProduct(product: Product)

    @Query("SELECT * FROM products WHERE productName = :name")
    fun getAllProducts(name: String): List<Product>

}

package com.example.pchub.dao
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete
import com.example.pchub.data.Product
import com.example.pchub.data.ProductEntity

@Dao
interface ProductDao {

    //@Insert
    //suspend fun insertProduct(product:Product: ProductEntity)

    //@Delete
    //suspend fun deleteProduct(product: ProductEntity)

    //@Query("SELECT * FROM products")
    //suspend fun getAllProducts(): List<ProductEntity>
}

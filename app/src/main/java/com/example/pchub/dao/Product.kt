package com.example.pchub.dao
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val productName: String,
    val productPrice: String,
    val productDescription: String,
    val imagePath: String
)


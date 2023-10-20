package com.example.pchub.data

data class User(
    val firstName: String,
    val lastName: String,
    val username: String,
    var imagePath: String = ""
){
    constructor(): this("","","","")
}

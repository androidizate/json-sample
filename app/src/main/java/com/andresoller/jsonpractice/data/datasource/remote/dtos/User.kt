package com.andresoller.jsonpractice.data.datasource.remote.dtos

data class User(
    val address: Address = Address(),
    val company: Company = Company(),
    val email: String = "",
    val id: Int = 0,
    val name: String = "",
    val phone: String = "",
    val username: String = "",
    val website: String = ""
)
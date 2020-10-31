package com.andresoller.jsonpractice.data.datasource.remote.dtos

data class Address(
    val city: String = "",
    val geo: Geo = Geo(),
    val street: String = "",
    val suite: String = "",
    val zipcode: String = ""
)
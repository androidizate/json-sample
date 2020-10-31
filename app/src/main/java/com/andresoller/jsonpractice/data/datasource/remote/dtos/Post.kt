package com.andresoller.jsonpractice.data.datasource.remote.dtos

data class Post(
    val body: String = "",
    val id: Int = 0,
    val title: String = "",
    val userId: Int = 0
)
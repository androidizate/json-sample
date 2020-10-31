package com.andresoller.jsonpractice.data.datasource.remote.dtos


import com.squareup.moshi.Json

data class Comment(
    val body: String = "",
    val email: String = "",
    val id: Int = 0,
    val name: String = "",
    val postId: Int = 0
)
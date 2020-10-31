package com.andresoller.jsonpractice.data.datasource.remote.dtos


import com.squareup.moshi.Json

data class Album(
    val id: Int = 0,
    val title: String = "",
    val userId: Int = 0
)
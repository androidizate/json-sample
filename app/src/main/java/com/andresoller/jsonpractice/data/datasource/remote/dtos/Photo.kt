package com.andresoller.jsonpractice.data.datasource.remote.dtos


import com.squareup.moshi.Json

data class Photo(
    val albumId: Int = 0,
    val id: Int = 0,
    val thumbnailUrl: String = "",
    val title: String = "",
    val url: String = ""
)
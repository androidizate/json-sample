package com.andresoller.jsonpractice.data.datasource.remote.dtos

data class Todo(
    val completed: Boolean = false,
    val id: Int = 0,
    val title: String = "",
    val userId: Int = 0
)
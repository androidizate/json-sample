package com.andresoller.jsonpractice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.andresoller.jsonpractice.data.datasource.remote.dtos.Post
import com.andresoller.jsonpractice.data.datasource.remote.service.JsonService
import kotlinx.coroutines.coroutineScope
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivityViewModel : ViewModel() {

    private val service = Retrofit.Builder()
        .baseUrl("http://jsonplaceholder.typicode.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(JsonService::class.java)

    fun getAllPosts() = liveData {
        emit(service.getAllPosts())
    }
}
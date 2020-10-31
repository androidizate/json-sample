package com.andresoller.jsonpractice

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.andresoller.jsonpractice.data.datasource.remote.service.JsonService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class MainActivity : AppCompatActivity() {

    private val service = Retrofit.Builder()
        .baseUrl("http://jsonplaceholder.typicode.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(JsonService::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        getPost(1)
    }

    private fun getPost(postId: Int) = GlobalScope.launch(Dispatchers.Main) {
        val post = withContext(Dispatchers.IO) {
            service.getPost(postId)
        }
        findViewById<TextView>(R.id.post_body).text = post.body
    }
}
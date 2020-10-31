package com.andresoller.jsonpractice.data.datasource.remote.service

import com.andresoller.jsonpractice.data.datasource.remote.dtos.Comment
import com.andresoller.jsonpractice.data.datasource.remote.dtos.Post
import retrofit2.http.*

interface JsonService {

    @GET("posts")
    suspend fun getAllPosts(): List<Post>

    @POST("posts")
    suspend fun createPost(): Post

    @PUT("posts")
    suspend fun updatePost(): Post

    @DELETE("posts")
    suspend fun deletePost()

    @GET("posts/{id}")
    suspend fun getPost(
        @Path(value = "id") idPost: Int
    ): Post

    @GET("posts/{id}/comments")
    suspend fun getPostComments(
        @Path(value = "id") id: Int
    ): List<Comment>

    @GET("comments")
    suspend fun getComments(
        @Query("postId") id: Int? = null
    ): List<Comment>
}
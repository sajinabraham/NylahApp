package com.example.nylahapp.data

import okhttp3.Response
import retrofit2.http.GET

interface APIDetails {
    @GET("people")
    suspend fun getPeople():Response

    @GET("rooms")
    suspend fun getRooms():Response
}
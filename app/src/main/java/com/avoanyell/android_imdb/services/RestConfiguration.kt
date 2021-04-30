package com.avoanyell.android_imdb.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit

class RestConfiguration {
    companion object {
        fun getRestConfiguration(): Retrofit {
            val client = OkHttpClient.Builder().build()
            val retrofit = Retrofit.Builder()
                .baseUrl("https://imdb8.p.rapidapi.com")
                .client(client)
                .build()

            return retrofit
        }
    }
}
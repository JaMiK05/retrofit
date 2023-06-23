package uz.gita.retrofit.dataLayer.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Client {

    private val okHttpClient = OkHttpClient
        .Builder()
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://a7d6-195-158-16-140.ngrok-free.app")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()


}
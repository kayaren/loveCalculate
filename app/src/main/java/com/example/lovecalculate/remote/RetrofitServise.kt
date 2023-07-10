package com.example.lovecalculate.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitServise {
    var retrofit  = Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    var api = retrofit.create(LoveCalculateApi::class.java)
}
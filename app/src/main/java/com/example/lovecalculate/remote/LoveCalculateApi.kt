package com.example.lovecalculate.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface LoveCalculateApi{
    @GET("getPercentage")
   fun getPercentage(
        @Query("fname") firstName: String,
        @Query("sname") secondName:String,
        @Header("X-RapidAPI-Key") key:String = "3bc0e6239amshf673889958e30edp1065d2jsn03e40ca16dc0",
        @Header("X-RapidAPI-Host") host:String = "love-calculator.p.rapidapi.com"
   ):Call<User>
}
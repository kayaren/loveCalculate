package com.example.lovecalculate.remote

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("fname")
    var firstName : String,
    @SerializedName("sname ")
    var secondName : String,
    var percentage : String,
    var result : String)

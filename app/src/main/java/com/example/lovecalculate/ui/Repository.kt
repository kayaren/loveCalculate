package com.example.lovecalculate.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.lovecalculate.remote.RetrofitServise
import com.example.lovecalculate.remote.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class Repository {
    fun getData(firstName: String, secondName: String): MutableLiveData<User> {
        val liveLove = MutableLiveData<User>()
        RetrofitServise.api.getPercentage(firstName, secondName).enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.isSuccessful) {
                    liveLove.postValue(response.body())

                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e("ololo", "onFailure:${t.message} ",)
            }

        })
        return liveLove
    }
}
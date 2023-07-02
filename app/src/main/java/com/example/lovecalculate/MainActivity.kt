package com.example.lovecalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lovecalculate.databinding.ActivityMainBinding
import com.example.lovecalculate.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        with(binding) {
            btncal.setOnClickListener {
                RetrofitServise.api.getPercentage(fname.text.toString(), sname.text.toString())
                    .enqueue(object : Callback<User> {
                        override fun onResponse(call: Call<User>, response: Response<User>) {
                            if (response.isSuccessful) {
                                val user = response.body()
                                user?.let {
                                    binding.tvPercentage.text = it.percentage.toString()
                                }
                            } else {

                            }
                        }

                        override fun onFailure(call: Call<User>, t: Throwable) {

                        }
                    })
            }
        }
    }

}

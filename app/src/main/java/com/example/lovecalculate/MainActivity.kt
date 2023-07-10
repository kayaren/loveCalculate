package com.example.lovecalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.lovecalculate.databinding.ActivityMainBinding
import com.example.lovecalculate.remote.User
import com.example.lovecalculate.remote.RetrofitServise
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

val viewModel : LoveViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        with(binding) {
            btncal.setOnClickListener {
               viewModel.getLiveData(fname.text.toString(),sname.text.toString()).observe(this@MainActivity,
               Observer {LoveModel ->  Log.e("ololo", "onCreate:$LoveModel. ", ) })

            }
        }
    }

}

package com.example.lovecalculate

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lovecalculate.remote.User
import com.example.lovecalculate.ui.Repository

class LoveViewModel : ViewModel() {
    var repository  = Repository()


    fun getLiveData(firstName:String, secondName : String): LiveData<User>{
        return repository.getData(firstName,secondName)
    }
}
package com.example.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class todoViewModel:ViewModel() {
    private var _todo = MutableLiveData<List<tododata>>()
            val todo : LiveData<List<tododata>> = _todo

        // this function either call in API or in database or in memory
                // in this project it is in memory
    fun getAlltodo() {
        _todo.value= todoManager.getAlltodo().reversed()
    }

    fun addtodo(title: String){
        todoManager.addtodo(title)
        getAlltodo()
    }

    fun deletetodo(id: Int){
        todoManager.deletetodo(id)
        getAlltodo()
    }


}
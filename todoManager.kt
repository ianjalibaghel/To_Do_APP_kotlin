package com.example.todoapp

import java.time.Instant
import java.util.Date

object todoManager {
    //this is our in memory variable
    private val todoList = mutableListOf<tododata>()

    fun getAlltodo() : List<tododata>{
        return todoList
    }

    fun addtodo(title : String){
        todoList.add(tododata(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun deletetodo(id :Int){
        todoList.removeIf{
            it.id==id
        }
    }
}
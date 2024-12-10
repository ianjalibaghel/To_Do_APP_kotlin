package com.example.todoapp

import java.time.Instant
import java.util.Date

data class tododata(
    var id: Int,
    var title : String,
    var CreatedAt : Date
)

fun getAlldata(): List<tododata>{
    return  listOf<tododata>(
            tododata(1,"first todo: ", Date.from(Instant.now())),
            tododata(2,"second todo: ", Date.from(Instant.now())),
            tododata(3,"third todo: ", Date.from(Instant.now())),
            tododata(4,"fourth thing todo: ", Date.from(Instant.now()))
    );
}

package com.example.todolist
//A data class that stores data for the recycler view items
data class Todo(
    val title: String,
    var isChecked: Boolean = false
)
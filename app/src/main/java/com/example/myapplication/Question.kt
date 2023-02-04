package com.example.myapplication


data class Question (
    val question: String,
    val optionList: List<String> ,
    val correctAnswer: Int
)
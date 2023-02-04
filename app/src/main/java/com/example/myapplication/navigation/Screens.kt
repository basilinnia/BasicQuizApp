package com.example.myapplication.navigation

sealed class Screens(val route: String) {
    object MainScreen: Screens("main")
    object QuizScreen: Screens("quiz")
}
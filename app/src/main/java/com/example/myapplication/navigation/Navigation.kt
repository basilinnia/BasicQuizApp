package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.QuestionList
import com.example.myapplication.presentation.screens.QuizMainScreen
import com.example.myapplication.presentation.screens.QuizScreen

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.QuizScreen.route) {
            QuizScreen(questionList = QuestionList.getQuestions(), navController)
        }
        composable(route = Screens.MainScreen.route) {
            QuizMainScreen(navController)
        }
    }
}

package com.example.myapplication.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.navigation.Screens
import com.example.myapplication.ui.theme.bg_color
import com.example.myapplication.ui.theme.optionBox_bg

@Composable
fun QuizMainScreen (navController: NavHostController) {
    Column(
        Modifier
            .background(bg_color)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(
            onClick = {navController.navigate(Screens.QuizScreen.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = optionBox_bg)
        ) {
            Text(text = "QUIZ")
        }
    }
}
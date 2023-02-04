package com.example.myapplication.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.myapplication.navigation.Screens
import com.example.myapplication.ui.theme.optionBox_border

@Composable
fun ResultScreen(navController: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = { navController.navigate(Screens.MainScreen.route) }) {
            Text(text = "RETURN TO MAIN PAGE")
        }
    }
}

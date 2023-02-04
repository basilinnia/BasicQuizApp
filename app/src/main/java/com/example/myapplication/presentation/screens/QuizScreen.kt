package com.example.myapplication.presentation.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication.presentation.components.OptionBoxes
import com.example.myapplication.Question
import com.example.myapplication.presentation.components.QuestionCard
import com.example.myapplication.navigation.Screens
import com.example.myapplication.presentation.components.ResultScreen
import com.example.myapplication.ui.theme.bg_color
import com.example.myapplication.ui.theme.bottom_button
import com.example.myapplication.ui.theme.optionBox_bg


@Composable
fun QuizScreen(questionList: List<Question>, navController: NavHostController) {

    val isComplete = remember { mutableStateOf(false) }
    val questionIndex = remember { mutableStateOf(0) }
    val optionColorList = remember { mutableStateListOf(optionBox_bg,optionBox_bg,optionBox_bg,optionBox_bg) }

    val animatedProgress by animateFloatAsState(
        targetValue = (questionIndex.value + 1) / questionList.size.toFloat(),
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    fun resetColors() {
        for (i in 0 until optionColorList.size) {
            optionColorList[i] = optionBox_bg
        }
    }

    if (isComplete.value) {
        ResultScreen(navController)
    } else {
        Column(
            Modifier
                .background(bg_color)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        )
        {
            Row(Modifier.fillMaxWidth()) {
                IconButton(onClick = { navController.navigate(Screens.MainScreen.route) }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(start = 3.dp)
                            .size(35.dp)
                    )
                }
            }
            Text(
                text = "Capital Quiz",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(12.dp))

            LinearProgressIndicator(
                color = bottom_button,
                progress = animatedProgress,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .background(optionBox_bg)
                    .height(20.dp)
            )
            QuestionCard(questionIndex.value, questionList)
            OptionBoxes(questionList = questionList, questionIndex.value, optionColorList)
            Spacer(modifier = Modifier.height(20.dp))
            Row(verticalAlignment = Alignment.Bottom) {
                Row(
                    modifier = Modifier
                        .clickable {
                            if (questionList.size - 1 > questionIndex.value) {
                                questionIndex.value += 1
                            } else {
                                isComplete.value = true
                            }

                            resetColors()
                        }
                        .fillMaxWidth()
                        .height(66.dp)
                        .background(bottom_button, RoundedCornerShape(11.dp, 11.dp, 0.dp, 0.dp)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = " NEXT ", fontSize = 23.sp, fontWeight = FontWeight.Bold, color = Color.White)
                }
            }
        }
    }
}
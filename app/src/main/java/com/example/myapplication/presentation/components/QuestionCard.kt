package com.example.myapplication.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.myapplication.Question
import com.example.myapplication.ui.theme.FirstBox
import com.example.myapplication.ui.theme.SecondBox
import com.example.myapplication.ui.theme.ThirdBox

@Composable
fun QuestionCard(questionIndex: Int, questionList: List<Question>) {
    BoxWithConstraints (Modifier.padding(vertical = 20.dp)) {
        val boxWidth = this.maxWidth
        Box(
            modifier = Modifier
                .width(boxWidth - 35.dp)
                .height(boxWidth - (boxWidth / 2) - 15.dp)
                .align(Alignment.TopCenter)
                .background(FirstBox, shape = RoundedCornerShape(20.dp))
                .zIndex(4f)
        ) {
            Column(modifier = Modifier.padding(start = 20.dp, end = 27.dp, top = 23.dp)) {
                Text(text = "${questionIndex + 1} / ${questionList.size}", fontSize = 19.sp, fontWeight = FontWeight.ExtraBold, color = Color.White)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = questionList[questionIndex].question, fontSize = 23.sp, fontWeight = FontWeight.Bold)
            }
        }
        Box(
            modifier = Modifier
                .width(boxWidth - 55.dp)
                .height(boxWidth - (boxWidth / 2) - 5.dp)
                .align(Alignment.TopCenter)
                .background(SecondBox, shape = RoundedCornerShape(20.dp))
                .zIndex(3f)
        )
        Box(
            modifier = Modifier
                .width(boxWidth - 75.dp)
                .height(boxWidth - (boxWidth / 2) + 5.dp)
                .align(Alignment.TopCenter)
                .background(ThirdBox, shape = RoundedCornerShape(20.dp))
                .zIndex(2f)
        )
    }
}
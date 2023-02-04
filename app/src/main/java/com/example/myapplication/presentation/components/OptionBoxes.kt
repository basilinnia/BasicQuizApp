package com.example.myapplication.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.Question
import com.example.myapplication.ui.theme.optionBox_bg
import com.example.myapplication.ui.theme.optionBox_border

@Composable
fun OptionBoxes (questionList: List<Question>, currentQuestion: Int, optionColorList: SnapshotStateList<Color>) {

    fun checkOption(selectedOption: Int?) {
        if (selectedOption == questionList[currentQuestion].correctAnswer) {
            optionColorList[selectedOption] = Color.Green

        } else {
            optionColorList[selectedOption!!] = Color.Red
        }
    }
    Column {
        questionList[currentQuestion].optionList.forEachIndexed {index, option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .size(330.dp, 56.dp)
                    .background(optionColorList[index], RoundedCornerShape(20.dp))
                    .border(2.dp, optionBox_border, RoundedCornerShape(20.dp))
                    .clickable {checkOption(index)},
                horizontalArrangement = Center
            ) {
                Text(text = option, fontSize = 23.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}
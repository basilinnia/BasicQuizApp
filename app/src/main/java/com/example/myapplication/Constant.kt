package com.example.myapplication

import com.example.myapplication.Question

object QuestionList{

    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()
        val que1 = Question(
            "Which of the following is the capital of France?",
            listOf("Paris", "London", "Madrid", "Rome"),
            0)
        questionsList.add(que1)



        val que2 = Question(
            "Which of the following is not a type of mammal?",
            listOf("Elephant", "Kangaroo", "Crocodile", "Whale"),
            2
        )
        questionsList.add(que2)


        val que3 = Question(
            "Which of the following is the longest river in Africa?",
            listOf("Nile", "Congo", "Zambezi", "Niger"),
            0
        )

        questionsList.add(que3)

        val que4 = Question(
            "Which of the following countries is known for the Amazon Rainforest?",
            listOf("Brazil", "Peru", "Colombia", "Venezuela"),
            0
        )
        questionsList.add(que4)

        val que5 = Question(
            "What is the largest ocean in the world?",
            listOf("Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean"),
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            "What is the name of the largest desert in the world?",
            listOf("Sahara", "Kalahari", "Atacama", "Gobi"),
            0
        )
        questionsList.add(que6)

        val que7 = Question(
            "Which of the following countries is known for the Victoria Falls?",
            listOf("Zambia", "Zimbabwe", "Botswana", "Namibia"),
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            "What is the name of the longest river in the world?",
            listOf("Nile", "Amazon", "Yangtze", "Mississippi"),
            0
        )
        questionsList.add(que8)

        val que9 = Question(
            "Which of the following countries is known for the Serengeti National Park?",
            listOf("Tanzania", "Kenya", "Uganda", "Rwanda"),
            0
        )
        questionsList.add(que9)

        val que10 = Question(
            "What is the name of the deepest ocean trench in the world?",
            listOf("Mariana Trench", "Kuril-Kamchatka Trench", "Japan Trench", "Philippine Trench"),
            0
        )
        questionsList.add(que10)

        val que11 = Question(
            "What is the name of the largest island in the world?",
            listOf("Greenland", "Borneo", "Madagascar", "New Guinea"),
            0
        )
        questionsList.add(que11)

        val que12 = Question(
            "Which of the following countries is known for the Taj Mahal?",
            listOf("India", "Pakistan", "Bangladesh", "Nepal"),
            0
        )
        questionsList.add(que12)


        return questionsList
    }
}
package com.emmanuel_yegon.quiz.activity

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.emmanuel_yegon.quiz.R
import com.emmanuel_yegon.quiz.databinding.ActivityMainBinding
import com.emmanuel_yegon.quiz.domain.QuestionModel

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window: Window = this@MainActivity.window
        window.statusBarColor=ContextCompat.getColor(this@MainActivity, R.color.grey)


        binding.apply {
            bottomMenu.setItemSelected(R.id.home)
            bottomMenu.setOnItemSelectedListener {
                if (it == R.id.board) {
                    startActivity(Intent(this@MainActivity, LeaderActivity::class.java))
                }
            }

            singleBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, QuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList()))
                startActivity(intent)
            }

        }
    }

    private fun questionList(): MutableList<QuestionModel> {
        val question: MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                1,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_1",
                null
            )
        )
        question.add(
            QuestionModel(
                2,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_2",
                null
            )
        )
        question.add(
            QuestionModel(
                3,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_3",
                null
            )
        )
        question.add(
            QuestionModel(
                4,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_4",
                null
            )
        )
        question.add(
            QuestionModel(
                5,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_5",
                null
            )
        )
        question.add(
            QuestionModel(
                6,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_6",
                null
            )
        )
        question.add(
            QuestionModel(
                1,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_1",
                null
            )
        )
        question.add(
            QuestionModel(
                6,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_6",
                null
            )
        )
        question.add(
            QuestionModel(
                7,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_7",
                null
            )
        )
        question.add(
            QuestionModel(
                8,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_8",
                null
            )
        )
        question.add(
            QuestionModel(
                9,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_9",
                null
            )
        )
        question.add(
            QuestionModel(
                10,
                "Which planet is the largest planet in the solar system ?",
                "Earth",
                "Mars",
                "Neptune",
                "Jupiter",
                "d",
                5,
                "q_10",
                null
            )
        )
        return question
    }
}

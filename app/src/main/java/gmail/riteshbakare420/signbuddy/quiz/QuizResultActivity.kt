package gmail.riteshbakare420.signbuddy.quiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import gmail.riteshbakare420.signbuddy.HomeActivity
import gmail.riteshbakare420.signbuddy.R

class QuizResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result)

//        val userName = findViewById<TextView>(R.id.userName)
        val displayResult = findViewById<TextView>(R.id.result)
        val finish  = findViewById<TextView>(R.id.finish)


//        userName.text = intent.getStringExtra(constants.userName)

        val correct = intent.getIntExtra(constants.correctAns,0)
        val total = intent.getIntExtra(constants.totalQue,0)

        displayResult.text = "Your Score is $correct out of $total "


        finish.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

}
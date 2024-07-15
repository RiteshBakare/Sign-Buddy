package gmail.riteshbakare420.signbuddy.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import gmail.riteshbakare420.signbuddy.R

class QuizActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition : Int = 1
    private var mQuestionList : ArrayList<Question>? = null
    private var selectPosition : Int = 0

    private var userName : String? = null
    private var currentAns : Int  = 0

    private var progressBar : ProgressBar? = null
    private var tvProgress : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var  optionOne : TextView? = null
    private var  optionTwo : TextView? = null
    private var  optionThree : TextView? = null
    private var  optionFour : TextView? = null
    private var btnSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        progressBar = findViewById(R.id.progressBarId)
        tvQuestion = findViewById(R.id.tvQuestion)
        tvProgress = findViewById(R.id.tvProgress)
        ivImage = findViewById(R.id.quizQuestionImage)
        optionOne = findViewById(R.id.optionOne)
        optionTwo = findViewById(R.id.optionTwo)
        optionThree = findViewById(R.id.optionThree)
        optionFour = findViewById(R.id.optionFour)
        btnSubmit = findViewById(R.id.btnSubmit)

        mQuestionList = constants.qetQuestion()

        setQuestion()

        optionOne?.setOnClickListener(this)
        optionTwo?.setOnClickListener(this)
        optionThree?.setOnClickListener(this)
        optionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)


    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        defaultOptionView()

        if (mCurrentPosition == mQuestionList!!.size) {
            btnSubmit?.text="FINISH"
        }
        else {
            btnSubmit?.text="SUBMIT"
        }

        tvQuestion?.text = question.Question
        ivImage?.setImageResource(question.Image)
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "${mCurrentPosition}/${(progressBar?.max)?.plus(1)}"

        userName = intent.getStringExtra(constants.userName)

        optionOne?.text = question.optionOne
        optionTwo?.text = question.optionTwo
        optionThree?.text = question.optionThree
        optionFour?.text = question.optionFour
    }

    override fun onClick(view: View?) {

        when(view?.id) {

            R.id.optionOne -> {
                optionOne?.let {
                    selectedOptions(it,1)
                }
            }
            R.id.optionTwo -> {
                optionTwo?.let {
                    selectedOptions(it,2)
                }
            }
            R.id.optionThree -> {
                optionThree?.let {
                    selectedOptions(it,3)
                }
            }
            R.id.optionFour -> {
                optionFour?.let {
                    selectedOptions(it,4)
                }
            }

            R.id.btnSubmit -> {

                if (selectPosition == 0 ) {
                    mCurrentPosition++
                    when{
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, QuizResultActivity::class.java)
                            intent.putExtra(constants.userName,userName)
                            intent.putExtra(constants.correctAns,currentAns)
                            intent.putExtra(constants.totalQue,mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else {
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if (question!!.correctAnd != selectPosition ) {
                        ansView(selectPosition, R.drawable.wrong_option_border_bg)
                    }
                    else {
                        currentAns++
                    }
                    ansView(question.correctAnd, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionList!!.size) {
                        btnSubmit?.text="FINISH"
                    }
                    else {
                        btnSubmit?.text="Go TO NEXT Question "
                    }

                    selectPosition = 0

                }

            }

        }

    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()

        optionOne?.let {
            options.add(0,it)
        }
        optionTwo?.let {
            options.add(1,it)
        }
        optionThree?.let {
            options.add(2,it)
        }
        optionFour?.let {
            options.add(3,it)
        }

        for(option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }

    }

    private fun selectedOptions(tv:TextView,selectedOptionNum: Int) {
        defaultOptionView()

        selectPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#7A8089"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background= ContextCompat.getDrawable(
            this,
            R.drawable.selected_button_view
        )

    }


    private fun ansView(answer: Int , drawableView : Int ) {

        when(answer) {

            1 -> {
                optionOne?.background = ContextCompat.getDrawable(this, drawableView)
            }
            2-> {
                optionTwo?.background = ContextCompat.getDrawable(this,drawableView)
            }
            3-> {
                optionThree?.background = ContextCompat.getDrawable(this,drawableView)
            }
            4-> {
                optionFour?.background = ContextCompat.getDrawable(this,drawableView)
            }
        }

    }

}
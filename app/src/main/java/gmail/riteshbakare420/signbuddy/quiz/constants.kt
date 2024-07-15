package gmail.riteshbakare420.signbuddy.quiz

import gmail.riteshbakare420.signbuddy.R

object constants {

    const val userName: String = "USER_NAME"
    const val correctAns: String = "CORRECT_ANS"
    const val totalQue: String = "TOTAL_QUESTION"

    fun qetQuestion(): ArrayList<Question> {

        val getQuestion = ArrayList<Question>()


        val que1 = Question(
            1, "Identify the correct Sign",
            R.drawable.w,
            "W", "V",
            "A", "P", 1
        )
        getQuestion.add(que1)

        val que2 = Question(
            1, "Identify the correct Sign",
            R.drawable.i,
            "D", "J",
            "I", "M", 3
        )
        getQuestion.add(que2)

        val que3 = Question(
            1, "Identify the correct Sign",
            R.drawable.d,
            "F", "D",
            "V", "Q", 2
        )
        getQuestion.add(que3)

        val que4 = Question(
            1, "Identify the correct Sign",
            R.drawable.a,
            "O", "H",
            "L", "A", 4
        )
        getQuestion.add(que4)

        val que5 = Question(
            1, "Identify the correct Sign",
            R.drawable.c,
            "C", "E",
            "O", "L", 1
        )
        getQuestion.add(que5)

        val que6 = Question(
            1, "Identify the correct Sign",
            R.drawable.p,
            "A", "X",
            "P", "S", 3
        )
        getQuestion.add(que6)


        val que7 = Question(
            1, "Identify the correct Sign",
            R.drawable.e,
            "B", "A",
            "K", "E", 4
        )
        getQuestion.add(que7)

        val que8 = Question(
            1, "Identify the correct Sign",
            R.drawable.v,
            "N", "W",
            "M", "V", 4
        )
        getQuestion.add(que8)

        val que9 = Question(
            1, "Identify the correct Sign",
            R.drawable.b,
            "G", "K",
            "B", "X", 3
        )
        getQuestion.add(que9)

        val que10 = Question(
            1, "Identify the correct Sign",
            R.drawable.g,
            "G", "S",
            "J", "R", 1
        )
        getQuestion.add(que10)


        return getQuestion
    }

}
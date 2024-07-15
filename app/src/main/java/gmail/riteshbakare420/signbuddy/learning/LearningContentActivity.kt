package gmail.riteshbakare420.signbuddy.learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import gmail.riteshbakare420.signbuddy.R
import gmail.riteshbakare420.signbuddy.learning.adapter.LearningAdapter
import gmail.riteshbakare420.signbuddy.learning.models.Learning

class LearningContentActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private lateinit var mList : ArrayList<Learning>

    companion object {
        const val LEARNING_LETTER = "LEARNING_LETTER"
        const val VIDEO_CODE = "VIDEO_CODE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning_content)

        recyclerView = findViewById(R.id.RVLearning)

        recyclerView.layoutManager = LinearLayoutManager(this)

        mList = loadLearningData()

        val learningAdapter = LearningAdapter(mList)

        learningAdapter.setOnItemClickListener(object : LearningAdapter.OnItemClickListener{

            override fun onItemClick(position: Int) {
                val intent = Intent(applicationContext, DetailLearningActivity::class.java)
                intent.putExtra(LEARNING_LETTER, mList[position].character)
                val code : String = sendVideoCode(mList[position].character)
                intent.putExtra(VIDEO_CODE,code)
                startActivity(intent)
//                Toast.makeText(applicationContext,"hello ${mList.get(position).character} Pressed ",Toast.LENGTH_LONG).show()
            }
        })

        recyclerView.adapter = learningAdapter

    }

    val hashMap = HashMap<String, String>()

    fun sendVideoCode(char: String) : String {
        var code: String = ""
        if(char == "A") {
            code = "dPyokJZHosw"
        }else if (char == "B") {
            code = "Pir6MkWZ33g"
        }else if (char == "C") {
            code = "Kn8Fs1iZGOs"
        }else if (char == "D") {
            code = "49QC2FTAY4A"
        }else if (char == "E") {
            code = "y42pt0pMtcY"
        }else if (char == "F") {
            code = "jMuOfkmfY2U"
        }else if (char == "G") {
            code = "XpvTSxR486Q"
        }else if (char == "H") {
            code = "XQcBx4F_ZJE"
        }else if (char == "I") {
            code = "_qofh7F-mBQ"
        }else if (char == "J") {
            code = "FEDXvi_IJi8"
        }else if (char == "K") {
            code = "YbEAzeSBbok"
        }else if (char == "L") {
            code = "sk1YvIlSMdM"
        }else if (char == "M") {
            code = "AJabVqc4f_4"
        }else if (char == "N") {
            code = "QK-7rSCcd-8"
        }else if (char == "O") {
            code = "2cwg4rzeNHA"
        }else if (char == "P") {
            code = "gXnnNLVefZA"
        }else if (char == "Q") {
            code = "AzApp1BQT6A"
        }else if (char == "R") {
            code = "u-4WJDKQwYs"
        }else if (char == "S") {
            code = "M2fCZnM0P_k"
        }else if (char == "T") {
            code = "lxYuNIy086g"
        }else if (char == "U") {
            code = "0v9wcdURvNk"
        }else if (char == "V") {
            code = "6NKjCA2fyi0"
        }else if (char == "W") {
            code = "a9sZxbTAfmM"
        }else if (char == "X") {
            code = "2LMIJkdCQkM"
        }
        else if (char == "Y") {
            code = "tjufBayVNzM"
        }else if (char == "Z") {
            code = "8_JebEngKGQ"
        }else {
            code= "6_gXiBe9y9A"
        }
        return code
    }

    private fun loadLearningData(): ArrayList<Learning> {
        val list: ArrayList<Learning> = ArrayList();
        list.add(Learning("A", R.drawable.a))
        list.add(Learning("B", R.drawable.b))
        list.add(Learning("C", R.drawable.c))
        list.add(Learning("D", R.drawable.d))
        list.add(Learning("E", R.drawable.e))
        list.add(Learning("F", R.drawable.f))
        list.add(Learning("G", R.drawable.g))
        list.add(Learning("H", R.drawable.h))
        list.add(Learning("I", R.drawable.i))
        list.add(Learning("J", R.drawable.j))
        list.add(Learning("K", R.drawable.k))
        list.add(Learning("L", R.drawable.l))
        list.add(Learning("M", R.drawable.m))
        list.add(Learning("N", R.drawable.n))
        list.add(Learning("O", R.drawable.o))
        list.add(Learning("P", R.drawable.p))
        list.add(Learning("Q", R.drawable.q))
        list.add(Learning("R", R.drawable.r))
        list.add(Learning("S", R.drawable.s))
        list.add(Learning("T", R.drawable.t))
        list.add(Learning("U", R.drawable.u))
        list.add(Learning("V", R.drawable.v))
        list.add(Learning("W", R.drawable.w))
        list.add(Learning("X", R.drawable.x))
        list.add(Learning("Y", R.drawable.y))
        list.add(Learning("Z", R.drawable.z))
        return list;
    }

}
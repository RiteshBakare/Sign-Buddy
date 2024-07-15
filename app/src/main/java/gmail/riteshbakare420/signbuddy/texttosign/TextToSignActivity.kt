package gmail.riteshbakare420.signbuddy.texttosign

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import gmail.riteshbakare420.signbuddy.R
import kotlinx.coroutines.*

class TextToSignActivity : AppCompatActivity() {

    private lateinit var button: MaterialButton
    private lateinit var editText: EditText
    private lateinit var imageView: ImageView

    private lateinit var text: String
    private var currentIndex: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_to_sign)

        button = findViewById(R.id.btnGenerate)
        editText = findViewById(R.id.etText)
        imageView = findViewById(R.id.ivImage)

        text = ""

        button.setOnClickListener {
            button.visibility = View.INVISIBLE
            startImageAnimation()
        }

    }


    private fun startImageAnimation() {

        text = editText.text.toString()
        currentIndex = 0

        val handler = Handler()

        handler.postDelayed(object : Runnable {

            override fun run() {

                if (currentIndex < text.length) {
                    val currentChar = text[currentIndex]

                    val imageResource: Int = getCharAssociatedImage(currentChar)
                    imageView.setImageResource(imageResource)

                    currentIndex++
                    handler.postDelayed(this, 1500) // Delay for 1500 milliseconds
                }
            }
        }, 0) // Initial delay before the first image
        button.visibility = View.VISIBLE
    }


    private fun getCharAssociatedImage(char: Char): Int {
        when (char) {
            'a' -> return R.drawable.a
            'b' -> return R.drawable.b
            'c' -> return R.drawable.c
            'd' -> return R.drawable.d
            'e' -> return R.drawable.e
            'f' -> return R.drawable.f
            'g' -> return R.drawable.g
            'h' -> return R.drawable.h
            'i' -> return R.drawable.i
            'j' -> return R.drawable.j
            'k' -> return R.drawable.k
            'l' -> return R.drawable.l
            'm' -> return R.drawable.m
            'n' -> return R.drawable.n
            'o' -> return R.drawable.o
            'p' -> return R.drawable.p
            'q' -> return R.drawable.q
            'r' -> return R.drawable.r
            's' -> return R.drawable.s
            't' -> return R.drawable.t
            'u' -> return R.drawable.u
            'v' -> return R.drawable.v
            'w' -> return R.drawable.w
            'x' -> return R.drawable.x
            'y' -> return R.drawable.y
            'z' -> return R.drawable.z
            else -> return 0
        }
    }

}
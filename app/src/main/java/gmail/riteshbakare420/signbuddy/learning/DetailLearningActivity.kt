package gmail.riteshbakare420.signbuddy.learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import gmail.riteshbakare420.signbuddy.R
import gmail.riteshbakare420.signbuddy.WordDictionaryActivity
import org.w3c.dom.Text

class DetailLearningActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_learning)

        val ans = intent.getStringExtra(LearningContentActivity.LEARNING_LETTER)
        val videoCode = intent.getStringExtra(LearningContentActivity.VIDEO_CODE)

        val youTubePlayerView: YouTubePlayerView = findViewById(R.id.youtube_player_view)

        setData(ans.toString())

        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {

                var videoId = "cGavOVNDj1s"

                if (videoCode != null) {
                    videoId = videoCode
                }
//                val videoId = "442ewPgXHQ0"
                youTubePlayer.loadVideo(videoId, 0F)
            }
        })

//        findViewById<TextView>(R.id.wordDictionary).setOnClickListener {
//            startActivity(Intent(this@DetailLearningActivity, WordDictionaryActivity::class.java))
//        }

    }

    private fun setData(char: String) {
        when (char) {
            "A" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.a)
                findViewById<TextView>(R.id.tvSign).text = "Sign A"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter A"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_a)
            }
            "B" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.b)
                findViewById<TextView>(R.id.tvSign).text = "Sign B"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter B"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_b)
            }
            "C" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.c)
                findViewById<TextView>(R.id.tvSign).text = "Sign C"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter C"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_c)
            }
            "D" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.d)
                findViewById<TextView>(R.id.tvSign).text = "Sign D"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter D"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_d)
            }
            "E" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.e)
                findViewById<TextView>(R.id.tvSign).text = "Sign E"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter E"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_e)
            }
            "F" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.f)
                findViewById<TextView>(R.id.tvSign).text = "Sign F"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter F"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_f)
            }
            "G" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.g)
                findViewById<TextView>(R.id.tvSign).text = "Sign G"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter G"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_g)
            }
            "H" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.h)
                findViewById<TextView>(R.id.tvSign).text = "Sign H"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter H"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_h)
            }
            "I" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.i)
                findViewById<TextView>(R.id.tvSign).text = "Sign I"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter I"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_i)
            }
            "J" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.j)
                findViewById<TextView>(R.id.tvSign).text = "Sign J"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter J"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_j)
            }
            "K" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.k)
                findViewById<TextView>(R.id.tvSign).text = "Sign K"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter K"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_k)
            }
            "L" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.l)
                findViewById<TextView>(R.id.tvSign).text = "Sign L"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter L"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_l)
            }
            "M" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.m)
                findViewById<TextView>(R.id.tvSign).text = "Sign M"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter M"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_m)
            }
            "N" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.n)
                findViewById<TextView>(R.id.tvSign).text = "Sign N"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter N"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_n)
            }
            "O" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.o)
                findViewById<TextView>(R.id.tvSign).text = "Sign O"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter O"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_o)
            }
            "P" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.p)
                findViewById<TextView>(R.id.tvSign).text = "Sign P"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter P"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_p)
            }
            "Q" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.q)
                findViewById<TextView>(R.id.tvSign).text = "Sign Q"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter Q"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_q)
            }
            "R" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.r)
                findViewById<TextView>(R.id.tvSign).text = "Sign R"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter R"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_r)
            }
            "S" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.s)
                findViewById<TextView>(R.id.tvSign).text = "Sign S"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter S"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_s)
            }
            "T" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.t)
                findViewById<TextView>(R.id.tvSign).text = "Sign T"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter T"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_t)
            }
            "U" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.u)
                findViewById<TextView>(R.id.tvSign).text = "Sign U"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter U"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_u)
            }
            "V" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.v)
                findViewById<TextView>(R.id.tvSign).text = "Sign V"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter V"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_v)
            }
            "W" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.w)
                findViewById<TextView>(R.id.tvSign).text = "Sign W"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter W"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_w)
            }
            "X" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.x)
                findViewById<TextView>(R.id.tvSign).text = "Sign X"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter X"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_x)
            }
            "Y" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.y)
                findViewById<TextView>(R.id.tvSign).text = "Sign Y"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter Y"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_y)
            }
            "Z" -> {
                findViewById<ImageView>(R.id.signImage).setImageResource(R.drawable.z)
                findViewById<TextView>(R.id.tvSign).text = "Sign Z"
                findViewById<TextView>(R.id.tvTitle).text = "Let's Learn About Letter Z"
                findViewById<TextView>(R.id.tvTheory).setText(R.string.letter_z)
            }
        }
    }
}
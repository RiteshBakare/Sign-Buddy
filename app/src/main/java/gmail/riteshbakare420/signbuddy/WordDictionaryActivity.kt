package gmail.riteshbakare420.signbuddy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WordDictionaryActivity : AppCompatActivity() {

    private lateinit var webView : WebView

    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_dictionary)

        webView = findViewById(R.id.web_view)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://babysignlanguage.com/dictionary/")

    }


}
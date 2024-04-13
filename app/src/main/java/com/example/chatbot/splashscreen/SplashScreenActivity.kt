package com.example.chatbot.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.chatbot.R
import com.example.chatbot.ui.MainActivity

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000 // Waktu tampilan splash screen dalam milidetik (3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()


        // Handler untuk menunda tindakan selama beberapa detik dan kemudian beralih ke aktivitas utama
        Handler().postDelayed({
            // Intent untuk beralih ke MainActivity setelah SPLASH_TIME_OUT
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup SplashScreenActivity agar tidak bisa diakses kembali setelah beralih ke MainActivity
        }, SPLASH_TIME_OUT)
    }
}

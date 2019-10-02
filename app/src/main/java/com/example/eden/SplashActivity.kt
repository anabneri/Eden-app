package com.example.eden

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ocultando barra de título da activity
        window.requestFeature(Window.FEATURE_NO_TITLE)
        // deixando activity no modo full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        //4 seg. de tempo para splash screen
        Handler().postDelayed({
            //iniciar activity main
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            //fim da activity
            finish()
        },4000)
    }
}
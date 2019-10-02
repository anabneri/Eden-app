package com.example.eden

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import android.view.Window
import android.view.WindowManager
import  android.os.Build


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = getColor(R.color.colorPrimary)
        }

    }

    @RequiresApi( Build.VERSION_CODES.LOLLIPOP)
        fun Window.setStatusBarColor(color: Int){
            this.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

            this.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            this.statusBarColor = ContextCompat.getColor(baseContext, color)
    }
}

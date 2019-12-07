package com.dalae37.phoz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    companion object{
        lateinit var instance : SplashActivity
        fun getContext() : Context {
            return instance.applicationContext
        }
    }
    private class SplashHandler : Runnable{
        override fun run() {
            instance.startActivity(Intent(getContext(),MainActivity::class.java))
            instance.finish()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        instance = this

        val hd  = Handler()
        hd.postDelayed(SplashHandler(), 1000)
    }

    override fun onBackPressed() {
        //Can't press back button while splashing
    }
}

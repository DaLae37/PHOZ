package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class JungranActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jungran)
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, KWaveActivity::class.java))
    }

}

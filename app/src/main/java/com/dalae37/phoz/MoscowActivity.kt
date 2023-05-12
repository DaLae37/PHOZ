package com.dalae37.phoz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_moscow.*

class MoscowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moscow)

        north_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, MoscowNorthActivity::class.java)) }
        center_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, MoscowCenterActivity::class.java)) }
        south_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, MoscowSouthActivity::class.java)) }
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, RussiaActivity::class.java))
    }
}

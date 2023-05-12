package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_moscow_north.*
import kotlinx.android.synthetic.main.activity_moscow_south.*

class MoscowSouthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moscow_south)

        colomenskaya_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, ColomenskayaActivity::class.java)) }
        yigzino_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, YigzinoActivity::class.java)) }
        sparrow_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, SparrowHillActivity::class.java)) }
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, MoscowActivity::class.java))
    }
}

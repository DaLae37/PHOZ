package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_korea.*
import kotlinx.android.synthetic.main.activity_kwave.*

class KWaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kwave)
        gangwondo_button.setOnClickListener{view->changeActivity(Intent(applicationContext, GangwondoActivity::class.java))}
        jungran_button.setOnClickListener{view->changeActivity(Intent(applicationContext, JungranActivity::class.java))}
        mokpo_button.setOnClickListener{view->changeActivity(Intent(applicationContext, MokpoActivity::class.java))}
        pohang_button.setOnClickListener{view->changeActivity(Intent(applicationContext, PohangActivity::class.java))}
        yangu_button.setOnClickListener{view->changeActivity(Intent(applicationContext, YangjuActivity::class.java))}
        hwasung_button.setOnClickListener{view->changeActivity(Intent(applicationContext, HwasungActivity::class.java))}
        saemangeum_button.setOnClickListener{view->changeActivity(Intent(applicationContext, SaemangeumActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, KoreaActivity::class.java))
    }
}

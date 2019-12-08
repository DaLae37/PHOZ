package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_moscow.*
import kotlinx.android.synthetic.main.activity_moscow_north.*

class MoscowNorthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moscow_north)

        izmilovo_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, IzmilovoMarketActivity::class.java)) }
        bethenha_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, BethenhaActivity::class.java)) }
        sakyamuni_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, SakyamuniParkActivity::class.java)) }
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, MoscowActivity::class.java))
    }
}

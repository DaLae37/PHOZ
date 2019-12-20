package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kwave.*
import kotlinx.android.synthetic.main.activity_nature.*

class NatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nature)
        dokdo_button.setOnClickListener{view->changeActivity(Intent(applicationContext, DokdoActivity::class.java))}
        river_button.setOnClickListener{view->changeActivity(Intent(applicationContext, RiverActivity::class.java))}
        ulsan_button.setOnClickListener{view->changeActivity(Intent(applicationContext, UlsanActivity::class.java))}
        taeahn_button.setOnClickListener{view->changeActivity(Intent(applicationContext, TaeahnActivity::class.java))}
        injae_button.setOnClickListener{view->changeActivity(Intent(applicationContext, InjaeActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, KoreaActivity::class.java))
    }
}

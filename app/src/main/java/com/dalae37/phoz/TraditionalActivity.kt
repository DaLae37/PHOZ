package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kwave.*
import kotlinx.android.synthetic.main.activity_traditional.*

class TraditionalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traditional)

        kyungbook_button.setOnClickListener{view->changeActivity(Intent(applicationContext, KyungbokActivity::class.java))}
        kyunghee_button.setOnClickListener{view->changeActivity(Intent(applicationContext, KyungheeActivity::class.java))}
        deoksu_button.setOnClickListener{view->changeActivity(Intent(applicationContext, DeoksuActivity::class.java))}
        changdeok_button.setOnClickListener{view->changeActivity(Intent(applicationContext, ChangdeokActivity::class.java))}
        changkyung_button.setOnClickListener{view->changeActivity(Intent(applicationContext, ChangkyungActivity::class.java))}
        buckcheon_button.setOnClickListener{view->changeActivity(Intent(applicationContext, BuckcheonActivity::class.java))}
        insa_button.setOnClickListener{view->changeActivity(Intent(applicationContext, InsaActivity::class.java))}
        ickseon_button.setOnClickListener{view->changeActivity(Intent(applicationContext, IkseonActivity::class.java))}
        jeonju_button.setOnClickListener{view->changeActivity(Intent(applicationContext, JeonjuActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, KoreaActivity::class.java))
    }
}

package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_korea.*
import kotlinx.android.synthetic.main.activity_russia.*

class KoreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea)
        tradition_button.setOnClickListener{view->changeActivity(Intent(applicationContext, TraditionalActivity::class.java))}
        nature_button.setOnClickListener{view->changeActivity(Intent(applicationContext, NatureActivity::class.java))}
        kwave_button.setOnClickListener{view->changeActivity(Intent(applicationContext, KWaveActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, MainActivity::class.java))
    }

}

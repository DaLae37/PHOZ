package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_russia.*

class RussiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_russia)

        moscow_button.setOnClickListener{view->changeActivity(Intent(applicationContext, MoscowActivity::class.java))}
        petersburg_button.setOnClickListener{view->changeActivity(Intent(applicationContext, SaintPetersburgActivity::class.java))}
        vladimir_button.setOnClickListener{view->changeActivity(Intent(applicationContext, VladimirVostockActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, MainActivity::class.java))
    }
}

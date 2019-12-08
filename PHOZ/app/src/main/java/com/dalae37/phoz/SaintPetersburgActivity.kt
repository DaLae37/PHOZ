package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_saint_petersburg.*

class SaintPetersburgActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saint_petersburg)

        peterhofpalace_button.setOnClickListener{view->changeActivity(Intent(applicationContext, PeterhofPalaceActivity::class.java))}
        revival_button.setOnClickListener{view->changeActivity(Intent(applicationContext, ChristRevivalCathedralActivity::class.java))}
        horseman_button.setOnClickListener{view->changeActivity(Intent(applicationContext, BronzeHorsemanActivity::class.java))}
        hermitage_button.setOnClickListener{view->changeActivity(Intent(applicationContext, HermitageMuseumActivity::class.java))}
        kazan_button.setOnClickListener{view->changeActivity(Intent(applicationContext, KazanCathedralActivity::class.java))}
        mariinsky_button.setOnClickListener{view->changeActivity(Intent(applicationContext, MariinskyTheatreActivity::class.java))}
        peterhof_button.setOnClickListener{view->changeActivity(Intent(applicationContext, PeterhofActivity::class.java))}
        issac_button.setOnClickListener{view->changeActivity(Intent(applicationContext, StIsaacCathedralActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, RussiaActivity::class.java))
    }
}

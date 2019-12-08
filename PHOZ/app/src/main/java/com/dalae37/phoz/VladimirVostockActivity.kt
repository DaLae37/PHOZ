package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_russia.*
import kotlinx.android.synthetic.main.activity_saint_petersburg.*
import kotlinx.android.synthetic.main.activity_vladimir_vostock.*

class VladimirVostockActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vladimir_vostock)

        arbat_button.setOnClickListener{view->changeActivity(Intent(applicationContext, ArbatStreetActivity::class.java))}
        carousel_button.setOnClickListener{view->changeActivity(Intent(applicationContext, CarouselAmusementParkActivity::class.java))}
        eagle_button.setOnClickListener{view->changeActivity(Intent(applicationContext, EagleObservatoryActivity::class.java))}
        folkopsky_button.setOnClickListener{view->changeActivity(Intent(applicationContext, FolklopskyCathedralActivity::class.java))}
        marine_button.setOnClickListener{view->changeActivity(Intent(applicationContext, MarineParkActivity::class.java))}
        truimph_button.setOnClickListener{view->changeActivity(Intent(applicationContext, TriumphalArchActivity::class.java))}
        vladivostok_button.setOnClickListener{view->changeActivity(Intent(applicationContext, VladivostokStationActivity::class.java))}
    }

    private fun changeActivity(intent: Intent) {
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, RussiaActivity::class.java))
    }
}

package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_moscow_center.*
import kotlinx.android.synthetic.main.activity_moscow_north.*

class MoscowCenterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moscow_center)

        redsquare_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, RedSquareActivity::class.java)) }
        basili_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, BasilicaCathedralActivity::class.java)) }
        zarajie_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, ZarajieParkActivity::class.java)) }
        gum_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, GumDepartmentStoreActivity::class.java)) }
        city_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, MoscowCityActivity::class.java)) }
        marbat_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, MArbatStreetActivity::class.java)) }
        christ_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, CathedralChristSaviorActivity::class.java)) }
        bolshoi_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, BolshoiTheatreActivity::class.java)) }
        gorky_button.setOnClickListener {view-> changeActivity(Intent(applicationContext, GorkyParkActivity::class.java)) }
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        changeActivity(Intent(applicationContext, MoscowActivity::class.java))
    }
}

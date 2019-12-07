package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_location.*
import kotlinx.android.synthetic.main.activity_main.*

class LocationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        location_search.setOnClickListener{view->changeActivity(Intent(applicationContext, SearchActivity::class.java))}
        location_location.setOnClickListener{view->changeActivity(Intent(applicationContext, LocationActivity::class.java))}
        location_main.setOnClickListener{view->changeActivity(Intent(applicationContext, MainActivity::class.java))}
        location_profile.setOnClickListener{view->changeActivity(Intent(applicationContext, ProfileActivity::class.java))}
        location_camera.setOnClickListener{view->changeActivity(Intent(applicationContext, CameraActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }
}

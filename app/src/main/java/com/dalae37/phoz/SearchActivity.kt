package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_location.*
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        search_search.setOnClickListener{view->changeActivity(Intent(applicationContext, SearchActivity::class.java))}
        search_location.setOnClickListener{view->changeActivity(Intent(applicationContext, LocationActivity::class.java))}
        search_main.setOnClickListener{view->changeActivity(Intent(applicationContext, MainActivity::class.java))}
        search_profile.setOnClickListener{view->changeActivity(Intent(applicationContext, ProfileActivity::class.java))}
        search_camera.setOnClickListener{view->changeActivity(Intent(applicationContext, CameraActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }
}

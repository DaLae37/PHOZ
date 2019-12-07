package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        profile_setting.setOnClickListener{view->changeActivity(Intent(applicationContext, SettingActivity::class.java))}
        profile_search.setOnClickListener{view->changeActivity(Intent(applicationContext, SearchActivity::class.java))}
        profile_location.setOnClickListener{view->changeActivity(Intent(applicationContext, LocationActivity::class.java))}
        profile_main.setOnClickListener{view->changeActivity(Intent(applicationContext, MainActivity::class.java))}
        profile_profile.setOnClickListener{view->changeActivity(Intent(applicationContext, ProfileActivity::class.java))}
        profile_camera.setOnClickListener{view->changeActivity(Intent(applicationContext, CameraActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }
}

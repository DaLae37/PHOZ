package com.dalae37.phoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.activity_location.*
import kotlinx.android.synthetic.main.activity_main.*

class LocationActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap : GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        val mFragment = map as SupportMapFragment
        mFragment.getMapAsync(this)

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

    override fun onMapReady(p0: GoogleMap?) {
        mMap = p0!!
    }
}

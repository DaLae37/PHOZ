package com.dalae37.phoz

import android.Manifest
import android.annotation.TargetApi
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val PERMISSIONS_REQUEST_CODE : Int = 1000
    private val PERMISSIONS : Array<String> = arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!hasPermissions(PERMISSIONS)) {
                requestPermissions(PERMISSIONS, PERMISSIONS_REQUEST_CODE)
            }
        }

        korea_button.setOnClickListener{view->changeActivity(Intent(applicationContext, KoreaActivity::class.java))}
        russia_button.setOnClickListener{view->changeActivity(Intent(applicationContext, RussiaActivity::class.java))}
        main_search.setOnClickListener{view->changeActivity(Intent(applicationContext, SearchActivity::class.java))}
        main_location.setOnClickListener{view->changeActivity(Intent(applicationContext, LocationActivity::class.java))}
        main_main.setOnClickListener{view->changeActivity(Intent(applicationContext, MainActivity::class.java))}
        main_profile.setOnClickListener{view->changeActivity(Intent(applicationContext, ProfileActivity::class.java))}
        main_camera.setOnClickListener{view->changeActivity(Intent(applicationContext, CameraActivity::class.java))}
    }

    private fun changeActivity(intent : Intent){
        startActivity(intent)
        finish()
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            PERMISSIONS_REQUEST_CODE -> {
                if (grantResults.isNotEmpty()) {
                    var cameraPermissionAccepted =
                        (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                    var diskPermissionAccepted =
                        (grantResults[1] == PackageManager.PERMISSION_GRANTED)

                    if (!cameraPermissionAccepted || !diskPermissionAccepted) {
                        showDialogForPermission("앱을 실행하려면 퍼미션을 허가해야합니다.")
                    }
                }
            }
        }
    }

    private fun hasPermissions(permissions : Array<String>) : Boolean {
        for (perms in permissions) {
            var result = ContextCompat.checkSelfPermission(this, perms)

            if (result == PackageManager.PERMISSION_DENIED) {
                return false
            }
        }

        return true
    }

    @TargetApi(Build.VERSION_CODES.M)
    private fun showDialogForPermission(msg : String){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("알림")
        builder.setMessage(msg)
        builder.setCancelable(false)
        builder.setPositiveButton("예",({dialogInterface, i ->  requestPermissions(PERMISSIONS,PERMISSIONS_REQUEST_CODE)}))
        builder.setNegativeButton("아니오",({dialogInterface, i ->  finish()}))
        builder.create().show()
    }
}

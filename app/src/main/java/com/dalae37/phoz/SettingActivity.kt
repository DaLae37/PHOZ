package com.dalae37.phoz

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_setting.*
import java.util.*


class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        changeLangKO.setOnClickListener{
            view->settingLocale("ko")
        }
        changeLangRU.setOnClickListener{
            view->settingLocale("ru")
        }
    }

    fun settingLocale(country : String){
        val locale = Locale(country)
        val config = Configuration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
        finish()
        startActivity(Intent(this, ProfileActivity::class.java))
    }
}

package com.example.sunrisesunsetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun getWeatherInfo(view:View){
        val appid = "10cd2fe68287d32ec0950627dcac7499"
        var base_url = "http://api.openweathermap.org/data/2.5/weather?"
        var location = "London, UK"
        var url = buildURL(base_url, location, appid)
    }

    fun buildURL(base_url:String, location:String, appid:String):String{
        return base_url + "q=" + location + "&APPID=" + appid
    }
}

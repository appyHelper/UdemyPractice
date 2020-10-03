package com.example.udemypractice

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {

    init{
        getBattery()
    }
    fun getBattery(){
        Log.d(Battery::class.qualifiedName,"log battery")
    }
}
package com.example.udemypractice

import android.util.Log


class Battery {

    init{
        getBattery()
    }
    fun getBattery(){
        Log.d(Battery::class.qualifiedName,"log battery")
    }
}
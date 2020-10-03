package com.example.udemypractice

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(battery: Battery,memory: Memory,simCard: SimCard){


    fun getSmartPhone(){
        Log.d(SmartPhone::class.qualifiedName,"log smart phone")
    }
}
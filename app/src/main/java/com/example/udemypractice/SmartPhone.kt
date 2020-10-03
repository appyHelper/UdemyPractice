package com.example.udemypractice

import android.util.Log


class SmartPhone(battery: Battery,memory: Memory,simCard: SimCard){


    fun getSmartPhone(){
        Log.d(SmartPhone::class.qualifiedName,"log smart phone")
    }
}
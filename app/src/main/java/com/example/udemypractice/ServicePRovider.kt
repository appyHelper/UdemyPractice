package com.example.udemypractice

import android.util.Log
import javax.inject.Inject

class ServicePRovider @Inject constructor() {
    init {
        getServicePRovider()
    }
    fun getServicePRovider(){
        Log.d(ServicePRovider::class.qualifiedName,"log service provider")
    }
}
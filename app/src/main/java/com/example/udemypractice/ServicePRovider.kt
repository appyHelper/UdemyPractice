package com.example.udemypractice

import android.util.Log


class ServicePRovider constructor() {
    init {
        getServicePRovider()
    }
    fun getServicePRovider(){
        Log.d(ServicePRovider::class.qualifiedName,"log service provider")
    }
}
package com.example.udemypractice

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(servicePRovider: ServicePRovider) {
init {
    getSimCard()
}
    fun getSimCard(){
        Log.d(SimCard::class.qualifiedName,"log simcard")
    }
}
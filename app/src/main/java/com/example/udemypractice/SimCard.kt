package com.example.udemypractice

import android.util.Log


class SimCard(servicePRovider: ServicePRovider) {
init {
    getSimCard()
}
    fun getSimCard(){
        Log.d(SimCard::class.qualifiedName,"log simcard")
    }
}
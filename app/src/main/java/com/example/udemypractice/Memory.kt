package com.example.udemypractice

import android.util.Log
import javax.inject.Inject

class Memory @Inject constructor() {
    init {
        getMemory()
    }
    fun getMemory(){
        Log.d(Memory::class.qualifiedName,"log memory")
    }
}
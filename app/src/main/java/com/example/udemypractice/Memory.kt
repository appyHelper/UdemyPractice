package com.example.udemypractice

import android.util.Log


class Memory  {
    init {
        getMemory()
    }
    fun getMemory(){
        Log.d(Memory::class.qualifiedName,"log memory")
    }
}
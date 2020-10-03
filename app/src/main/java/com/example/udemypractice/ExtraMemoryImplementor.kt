package com.example.udemypractice

import android.util.Log
import kotlin.math.E

class ExtraMemoryImplementor : ExtraMemory {
    override fun getExtraMemory(): Int {
        Log.d(ExtraMemoryImplementor::class.qualifiedName,"log extra memory")
        return 1000
    }
}
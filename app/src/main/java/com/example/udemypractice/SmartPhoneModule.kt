package com.example.udemypractice

import dagger.Module
import dagger.Provides


@Module
class SmartPhoneModule {

    @Provides
    fun getServiceProvide():ServicePRovider{
        return ServicePRovider()
    }

    @Provides
    fun getBattery():Battery{
        return Battery()
    }

    @Provides
    fun getMemory():Memory{
        return Memory()
    }

     @Provides
     fun getExtraMemory():ExtraMemory{
         return ExtraMemoryImplementor()
     }
}
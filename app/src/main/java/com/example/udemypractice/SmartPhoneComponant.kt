package com.example.udemypractice

import dagger.Component
import dagger.Module


@Component(modules = [SmartPhoneModule::class])
interface SmartPhoneComponant {

fun inject(obj1 : MainActivity)
}
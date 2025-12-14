package com.minisdk.pubsub.module

import android.util.Log

class ModuleLoader {
    val TAG = javaClass.name
    companion object {
        private val shared : ModuleLoader by lazy { ModuleLoader() }
        @JvmStatic
        fun getInstance(): ModuleLoader { return shared }
    }

    fun load(className: String){
        try {
            val clazz = Class.forName(className)
            clazz.getDeclaredConstructor().newInstance()
        }
        catch (ex: Exception){
            Log.e(TAG, "${className} load failed ${ex.message}")
        }
    }
}
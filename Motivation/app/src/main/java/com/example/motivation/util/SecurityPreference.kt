package com.example.motivation.util

import android.content.Context
import android.content.SharedPreferences

class SecurityPreference(context: Context) {

    private val mSharedPreferences: SharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getStoredString(key: String): String? {
        return mSharedPreferences.getString(key, "")
    }



}

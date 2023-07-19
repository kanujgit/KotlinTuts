package com.kotlin.inline

import android.content.SharedPreferences
import androidx.core.content.edit

class InlineDEmo {


    fun SharedPreferences.edit(commit: Boolean, action: SharedPreferences.Editor.() -> Unit) {
        val editor = edit()
        action(editor)
        if (commit) {
            editor.commit()
        } else {
            editor.apply()
        }
    }

    class PreferencesManager(private val preferences: SharedPreferences) {
        fun saveToken(token: String) {
            preferences.edit { putString("KEY", token) }
        }
    }


    companion object {
        private const val KEY_TOKEN = "token"
    }
}
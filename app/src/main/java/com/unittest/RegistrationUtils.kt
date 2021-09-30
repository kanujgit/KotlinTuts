package com.unittest

object RegistrationUtils {
    private val userList = listOf<String>("Anuj", "12345")

    fun validateRegistrationDetails(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty())
            return false
        if (userName in userList)
            return false
        if (password != confirmPassword)
            return false
        if (password.count { it.isDigit() } < 2)
            return false

        return true


    }
}
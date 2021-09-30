package com.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilsTest {

    @Test
    fun `empty user name return false`() {
        val result = RegistrationUtils.validateRegistrationDetails(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid user name and correctly repeated password true`() {
        val result = RegistrationUtils.validateRegistrationDetails(
            "anuj",
            "123as",
            "123as"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exist return false`() {
        val result = RegistrationUtils.validateRegistrationDetails(
            "Anuj",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty return false`() {
        val result = RegistrationUtils.validateRegistrationDetails(
            "Anuj",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `repeated password is not matched return false`() {
        val result = RegistrationUtils.validateRegistrationDetails(
            "Anuj",
            "12434",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password length is less the two return false`() {
        val result = RegistrationUtils.validateRegistrationDetails(
            "Anuj",
            "12",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password should contain two digit  return true`() {
        val result = RegistrationUtils.validateRegistrationDetails(
            "Anuj",
            "1we",
            "1we"
        )
        assertThat(result).isFalse()
    }


}
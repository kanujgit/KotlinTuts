package com.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.kotlintuts.R
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceCompareTest {
    private lateinit var resourceCompare: ResourceCompare


    @Before
    fun setup() {
        resourceCompare = ResourceCompare()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "KotlinTuts")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceSameAsGivenString_returnFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "xyz")
        assertThat(result).isFalse()
    }
}
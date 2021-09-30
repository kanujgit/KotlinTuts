package com.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TestFibonacciNumberTest {

    @Test
    fun `enter 0 return true`() {
        val res = TestFibonacciNumber.fib(0)
        assertThat(res).isGreaterThan(-1)
    }
}
package com.example.testintroduction

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestTax {

    private lateinit var tax: Tax

    @Before
    fun setup() {
        tax = Tax()
    }

    @After
    fun teardown() {

    }

    @Test
    fun calculateTaxTest() {

        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)

    }
    @Test
    fun calculateIncomeText() {

        val netIncome = Tax().calculateIncome(200.0,0.2)
        assertThat(netIncome).isEqualTo(160)

    }
}
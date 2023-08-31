package com.curso.android.app.practica.proyecto_iriarte

import android.app.Activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    @get:Rule
    val MainActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun compararTexts_iguales() {
        onView(withId(R.id.editText1)).perform(typeText("Text"))
        onView(withId(R.id.editText2)).perform(typeText("Text"))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.Resultado)).check(matches(withText("Textos iguales")))

    }
}
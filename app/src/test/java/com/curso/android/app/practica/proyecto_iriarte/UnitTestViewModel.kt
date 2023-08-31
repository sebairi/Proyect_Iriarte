package com.curso.android.app.practica.proyecto_iriarte

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.curso.android.app.practica.proyecto_iriarte.ViewModel.MainViewModel
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTestViewModel {


    @get:Rule val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun compararText_iguales() {
        val viewModel = MainViewModel()
        viewModel.compararTexts("text", "text")
        assertEquals("Textos iguales", viewModel.modeloComparacion.value?.result)
    }

    @Test
    fun compararText_diferentes() {
        val viewModel = MainViewModel()
        viewModel.compararTexts("text1", "text2")
        assertEquals("Textos distintos", viewModel.modeloComparacion.value?.result)
    }



}
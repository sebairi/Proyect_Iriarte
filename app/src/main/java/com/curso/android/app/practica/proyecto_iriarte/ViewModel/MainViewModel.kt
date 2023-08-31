package com.curso.android.app.practica.proyecto_iriarte.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.proyecto_iriarte.Model.modelo

class MainViewModel: ViewModel() {
    private val _modeloComparacion = MutableLiveData<modelo>()
    val modeloComparacion: LiveData<modelo> = _modeloComparacion

    fun compararTexts(text1: String, text2: String) {
        val result = if (text1 == text2) {
            "Textos iguales"
        } else {
            "Textos distintos"
        }
        _modeloComparacion.value = modelo(result)
    }
}
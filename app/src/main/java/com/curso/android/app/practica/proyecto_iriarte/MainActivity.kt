package com.curso.android.app.practica.proyecto_iriarte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.curso.android.app.practica.proyecto_iriarte.ViewModel.MainViewModel
import com.curso.android.app.practica.proyecto_iriarte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.modeloComparacion.observe(this, Observer { result ->
            binding.Resultado.text= result.result
        })

        binding.button.setOnClickListener {
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()

            viewModel.compararTexts(text1, text2)
        }
    }
}
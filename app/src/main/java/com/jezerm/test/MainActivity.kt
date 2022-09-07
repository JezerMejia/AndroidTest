package com.jezerm.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jezerm.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.init()
    }

    private fun init() {
        this.binding.btnSaludar.setOnClickListener {
            var nom: String = this.binding.editTextTextPersonName.text.toString()
            val saludo = this.saludar(nom)
            Toast.makeText(this, saludo, Toast.LENGTH_LONG).show()
        }
    }

    fun saludar(nombre: String): String {
        return "Hola $nombre! Un placer conocerte."
    }
}
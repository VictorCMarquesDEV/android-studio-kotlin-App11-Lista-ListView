package com.example.app11

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.app11.databinding.ActivityMainBinding

// App11: Lista e ListView

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaNumeros = ArrayList<Int>()
        listaNumeros.add(1)
        listaNumeros.add(10)
        listaNumeros.add(5)
        listaNumeros.add(4)
        listaNumeros.add(8)
        //listaNumeros [1, 10, 5, 4, 8]

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNumeros)
        binding.listView.adapter = adapter
        
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicado em ${listaNumeros[position]}", Toast.LENGTH_SHORT).show()
        }

        /*
        val primeiro = listaNumeros.get(0) -> 1
        listaNumeros.removeAt(0) -> listaNumeros [10, 5, 4, 8]
        listaNumeros.remove(5) -> listaNumeros [10, 4, 8]
        val tamanho = listaNumeros.size -> 3
        listaNumeros.clear() -> listaNumeros []
         */
    }
}
package com.oceanbrasil.ocean_android_introducao_21_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)

        btEnviar.setOnClickListener {
            tvResultado.text = etNome.text.toString()
        }

        /*
        Desafios:
        1 - Criar um botão "Limpar" que, ao clicado, limpada o texto do EditText
        e volta o TextView para o valor inicial
        2 - Criar um EditText para o sobrenome e, ao clicar no Botão enviar, exibe
        no TextView do resultado o nome e o sobrenome juntos.

        Para praticar
        - Faça os desafios em um projeto novo, completamente do zero, para treinar
        tudo o que foi visto em aula.
        */
    }
}

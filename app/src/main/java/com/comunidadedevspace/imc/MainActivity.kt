package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //recuperar os componentes edittext
        //Criar uma variavel e associar o componente de UI<EditText>
        //Recuperar o botao que esta na tela
        //Colocar acao no botao
        //Recuperar o texto digitado no peso

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text
            val altura = edtAltura.text

            println("Seu peso: "+ peso)
            println("Sua Altura: "+ altura)
        }
    }
}
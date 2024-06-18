package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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
            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
                //Mostra mensagem ao usuario
                Snackbar
                    .make(
                        edtPeso,
                        "Prencha todos os campos",
                        Snackbar.LENGTH_LONG
                )
                .show()

            } else {

                    val peso = edtPeso.text.toString().toFloat()
                    val altura = edtAltura.text.toString().toFloat()
                    val alturaQ2 = altura * altura
                    val resultado = peso / alturaQ2

                //Navegar para a proxima tela
                //Criar o layout da proxima tela
                //Passar dados (resultado) para a proxima tela

                //intent - Classe do proprio android
                    val intent = Intent(this, Resultactivity::class.java)
                    intent.putExtra(KEY_RESULT_IMC, resultado)
                    startActivity(intent)

                    println("Seu IMC: "+ resultado)
                }



        }
    }
}
package com.example.fuelc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_FUEL3 = "ResultActivity.KEY_FUEL3"

class Result_Activity : AppCompatActivity() {

    lateinit var tvquilome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        tvquilome = findViewById(R.id.tvquilom)


        //nomeando textview onde ira aparecer so dados para os usuarios
        val tvprecoo = findViewById<TextView>(R.id.tvpreco)
        val tvcombustivel = findViewById<TextView>(R.id.tvcomb)
        //
        val tvquilome = findViewById<TextView>(R.id.tvquilom)


        //recuperando os dados das telas anteriores
        val preco = intent.getFloatExtra("KEY_RESULT_FUEL", 0.1f)
        val tvlabel2 = intent.getFloatExtra("KEY_RESULT_FUEL2", 0.1f)
        // tem que exibir no resultado dist


        val distancia= intent.getFloatExtra("KEY_RESULT_FUEL3", 0.1f)



        tvprecoo.text = preco.toString()
        tvcombustivel.text = tvlabel2.toString()

        tvquilome.text = distancia.toString()

    }

}
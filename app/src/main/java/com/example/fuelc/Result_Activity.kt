package com.example.fuelc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_FUEL3 = "ResultActivity.KEY_FUEL3"

class Result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        //nomeando textview onde ira aparecer so dados para os usuarios
        val tvprecos = findViewById<TextView>(R.id.tvpreco)
        val tvcombu = findViewById<TextView>(R.id.tvcomb)
        val tvquilome = findViewById<TextView>(R.id.tvquilom)

        //recuperando os dados das telas anteriores
        val preco = intent.getFloatExtra("KEY_RESULT_FUEL", 0.1f)
        val  tvlabel2= intent.getFloatExtra("KEY_RESULT_FUEL2", 0.1f)
        val  dist= intent.getFloatExtra("KEY_RESULT_FUEL3", 0.1f)

        tvcombu.text = tvcombu.toString().toString()
    }
}
package com.example.fuelc

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

const val KEY_RESULT_FUEL3 = "ResultActivity.KEY_FUEL3"

class Result_Activity : AppCompatActivity() {

    lateinit var tvquilom: TextView
    //
    //lateinit var preco: TextView
    //lateinit var tvcomb: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        //tvquilom = findViewById(R.id.tvquilom)
        //preco = findViewById(R.id.tvpreco)
        //tvcomb = findViewById(R.id.tvcomb)
        //nomeando textview onde ira aparecer so dados para os usuarios

        val tvpreco = findViewById<TextView>(R.id.tvpreco)
        val tvcombustivel = findViewById<TextView>(R.id.tvcomb)
        val tvquilome = findViewById<TextView>(R.id.tvquilom)
        val result_tv = findViewById<TextView>(R.id.tvresult)

        //recuperando os dados das telas anteriores
        val precocombustivel = intent.getFloatExtra("KEY_RESULT_FUEL", 0f)
        val tvlabel= intent.getFloatExtra("KEY_RESULT_FUEL2", 0f)
        val dist= intent.getFloatExtra("KEY_RESULT_FUEL3", 0f)



        val result = dist / tvlabel
        val resultado = result * precocombustivel

        result_tv.text = resultado.toString()

        tvpreco.text = precocombustivel.toString()
        tvcombustivel.text = tvlabel.toString()
        tvquilome.text = dist.toString()

    }

}
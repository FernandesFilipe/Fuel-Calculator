package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

const val KEY_RESULT_FUEL3 = "ResultActivity.KEY_FUEL3"

class Result_Activity : AppCompatActivity() {

    lateinit var tvquilom: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val btnvoltar4 = findViewById<ImageView>(R.id.btn4)
        btnvoltar4.setOnClickListener{
            finish()
        }

        //nomeando textview onde ira aparecer os dados para os usuarios
        val tvpreco = findViewById<TextView>(R.id.tvpreco)
        val tvcombustivel = findViewById<TextView>(R.id.tvcomb)
        val tvquilome = findViewById<TextView>(R.id.tvquilom)
        val resulttv = findViewById<TextView>(R.id.tvresult)

        //recuperando os dados das telas anteriores
        val precocombustivel = intent.getFloatExtra("KEY_RESULT_FUEL", 0f)
        val tvlabel= intent.getFloatExtra("KEY_RESULT_FUEL2", 0f)
        val dist= intent.getFloatExtra("KEY_RESULT_FUEL3", 0f)

        val result = dist / tvlabel
        val resultado = result * precocombustivel

        val Dista = if (dist==dist.toInt().toFloat()){
            dist.toInt().toString()
        } else {
            dist.toString()
        }

        val Tvlabel = if (tvlabel==tvlabel.toInt().toFloat()){
            tvlabel.toInt().toString()
        } else {
            tvlabel.toString()
        }

        val Precocombustivel = if (precocombustivel == precocombustivel.toInt().toFloat()) {
            precocombustivel.toInt().toString()
        } else {
            precocombustivel.toString()
        }

        val Resultado =  if (resultado == resultado.toInt().toFloat()){
            resultado.toInt().toString()
        } else {
            resultado.toString()
        }

        resulttv.text = Resultado
        tvpreco.text = Precocombustivel
        tvcombustivel.text = Tvlabel
        tvquilome.text = Dista

        val buttonvoltar5 = findViewById<Button>(R.id.button5)
        buttonvoltar5.setOnClickListener{
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}
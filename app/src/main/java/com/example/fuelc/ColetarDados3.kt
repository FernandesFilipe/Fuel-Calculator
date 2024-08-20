package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_FUEL2 = "ResultActivity.KEY_FUEL2"

class ColetarDados3 : AppCompatActivity() {
    lateinit var button4 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados3)

        button4 = findViewById<Button>(R.id.button4)

        val dist = intent.getFloatExtra("Dist_F",0.1F)

        button4.setOnClickListener {
            //serve para indicar para qual tela vai passar
            val intent = Intent (this, Result_Activity::class.java)
            //serve para identificar oque quer resgatar
            val preco = intent.getFloatExtra("KEY_RESULT_FUEL", 0.1f)
            val  tvlabel2= intent.getFloatExtra("KEY_RESULT_FUEL2", 0.1f)
            //val Dist = intent.getFloatExtra("Dist_F",0.1f)
            //serve para criar chave
            intent.putExtra("KEY_RESULT_FUEL3",dist)
                .apply {
                    putExtra("precoC", preco)
                    putExtra("TvConst",tvlabel2)
                    putExtra("Dist_F",dist)
                }


            startActivity(intent)

        }
    }
}
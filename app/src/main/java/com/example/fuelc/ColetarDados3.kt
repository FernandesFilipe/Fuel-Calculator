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

        val Dist = intent.getFloatExtra("Dist_F",0.1F)

        button4.setOnClickListener {
            val intent = Intent (this,ColetarDados3::class.java)
            val preco = intent.getFloatExtra("precoC", 0.1f)
            val  tvlabel2= intent.getFloatExtra("tvConst", 0.1f)
            //val Dist = intent.getFloatExtra("Dist_F",0.1f)
            intent.putExtra("KEY_RESULT_FUEL3",Dist)
                .apply {
                    putExtra("preco_C", preco)
                    putExtra("TvConst",tvlabel2)
                    putExtra("Dist_F",Dist)
                }


            startActivity(intent)

        }
    }
}
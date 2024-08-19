package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_FUEL =  "ResultActivity.KEY_FUEL"

class ColetarDados2 : AppCompatActivity() {

    lateinit var button3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados2)

        button3=findViewById<Button>(R.id.button3)

        val  tvlabel2= intent.getFloatExtra("tvConst", 0.1f)

        button3.setOnClickListener {
            val intent = Intent (this,ColetarDados2::class.java)
            val preco = intent.getFloatExtra("precoC", 0.1f)
            //val  tvlabel2= intent.getFloatExtra("tvConst", 0.1f)
            intent.putExtra("KEY_RESULT_FUEL2", tvlabel2)
                .apply {
                    putExtra("precoC",preco)
                    putExtra("tvConst", tvlabel2)
                }
            startActivity(intent)
        }
    }
}
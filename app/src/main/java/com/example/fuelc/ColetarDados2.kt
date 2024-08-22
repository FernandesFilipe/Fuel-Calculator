package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class ColetarDados2 : AppCompatActivity() {

    lateinit var button3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados2)

        button3=findViewById<Button>(R.id.button3)

        val preco = intent.getFloatExtra("KEY_RESULT_FUEL", 0f)
        val  tvlabel2= intent.getFloatExtra("KEY_RESULT_FUEL2", 0f)

        button3.setOnClickListener {
            val intent = Intent (this,ColetarDados3::class.java)
            intent.putExtra("KEY_RESULT_FUEL", preco)
            intent.putExtra("KEY_RESULT_FUEL2", tvlabel2)
                .apply {
                    putExtra("KEY_RESULT_FUEL",preco)
                    putExtra("KEY_RESULT_FUEL2", tvlabel2)
                }
            startActivity(intent)

        }
    }
}
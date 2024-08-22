package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

const val KEY_RESULT_FUEL2 = "ResultActivity.KEY_FUEL2"

class ColetarDados3 : AppCompatActivity() {
    lateinit var button4 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados3)

        button4 = findViewById<Button>(R.id.button4)


        button4.setOnClickListener {

            val intent = Intent (this, Result_Activity::class.java)

            val preco = intent.getFloatExtra("KEY_RESULT_FUEL", 0.1f)
            val  tvlabel2= intent.getFloatExtra("KEY_RESULT_FUEL2", 0.1f)
            val dist= intent.getFloatExtra("KEY_RESULT_FUEL3", 0.1f)


            intent.putExtra("KEY_RESULT_FUEL", preco)
            intent.putExtra("KEY_RESULT_FUEL2", tvlabel2)
            intent.putExtra("KEY_RESULT_FUEL3",dist)

                .apply {
                    putExtra("KEY_RESULT_FUEL", preco)
                    putExtra("KEY_RESULT_FUEL2",tvlabel2)
                    putExtra("KEY_RESULT_FUEL3",dist)

                }

            startActivity(intent)


        }
    }
}
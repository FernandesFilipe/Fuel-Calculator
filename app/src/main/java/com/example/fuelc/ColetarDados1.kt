package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class ColetarDados1 : AppCompatActivity() {

    lateinit var button2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados1)

        button2 = findViewById<Button>(R.id.button2)

        val preco = intent.getFloatExtra("precoC", 0.1f)

        button2.setOnClickListener {
            val intent = Intent(this, ColetarDados2::class.java)

            intent.putExtra("KEY_RESULT_FUEL", preco)

                .apply {
                    putExtra("precoC",preco)
                }
            startActivity(intent)
        }
    }
}










//intent.putExtra("key", Comb.toString())
//intent.putExtra("key", Comb.toString())
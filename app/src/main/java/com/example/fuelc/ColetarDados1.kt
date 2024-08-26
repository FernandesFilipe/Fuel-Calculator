package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.color.DynamicColors.Precondition
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class ColetarDados1 : AppCompatActivity() {

    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados1)

        button2 = findViewById<Button>(R.id.button2)

        val precoc = findViewById<TextInputEditText>(R.id.preco)

        button2.setOnClickListener {
            val precocom : String = precoc.text.toString()

            if (precocom ==""){
                Snackbar
                    .make (
                        precoc,
                        "Preencha todos os campos" ,
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            }else {
                val precocombustivel: Float = precoc.text.toString().toFloat()
                val intent = Intent(this, ColetarDados2::class.java)

                    .apply {
                        putExtra("KEY_RESULT_FUEL", precocombustivel)
                    }
                startActivity(intent)
            }
        }
    }
}


package com.example.fuelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class ColetarDados2 : AppCompatActivity() {

    lateinit var button3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coletar_dados2)

        val btntvoltar3 = findViewById<ImageView>(R.id.btn2)
        btntvoltar3.setOnClickListener{
            finish()
        }

        button3=findViewById<Button>(R.id.button3)

        val tvlabel2 = findViewById<TextInputEditText>(R.id.tv_label2)

        val preco = intent.getFloatExtra("KEY_RESULT_FUEL",0f)

        button3.setOnClickListener {
            val tvlabelS : String = tvlabel2.text.toString()

            if (tvlabelS==""){
                Snackbar
                    .make (
                        tvlabel2,
                        "Preencha todos os campos" ,
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            }else {
                val tvlabel : Float = tvlabel2.text.toString().toFloat()
                val intent = Intent (this,ColetarDados3::class.java)
                    .apply {
                        putExtra("KEY_RESULT_FUEL",preco)
                        putExtra("KEY_RESULT_FUEL2", tvlabel)
                    }
                startActivity(intent)

            }

        }
    }
}
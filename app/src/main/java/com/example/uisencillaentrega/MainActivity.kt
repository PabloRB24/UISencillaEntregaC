package com.example.uisencillaentrega

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            counter++
            val message = "Se ha hecho clic en el botón $counter veces"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}




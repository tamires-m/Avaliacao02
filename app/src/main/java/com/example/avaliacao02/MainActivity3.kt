package com.example.avaliacao02

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main3)

    // Recupere os arrays da Intent
    val cartasArray1 = intent.getStringArrayListExtra("cartasArray1") ?: ArrayList()
    val cartasArray2 = intent.getStringArrayListExtra("cartasArray2") ?: ArrayList()

    // Encontre as Views para exibir os arrays
    val textViewArray1 = findViewById<TextView>(R.id.textViewArray1)
    val textViewArray2 = findViewById<TextView>(R.id.textViewArray2)

    // Converta os arrays em strings e exiba nas Views
    textViewArray1.text = "Cartas no Array 1:\n${cartasArray1.joinToString(", ")}"
    textViewArray2.text = "Cartas no Array 2:\n${cartasArray2.joinToString(", ")}"
}
}




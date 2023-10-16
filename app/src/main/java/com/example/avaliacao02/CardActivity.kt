package com.example.avaliacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.avaliacao02.R

class CardActivity : AppCompatActivity() {
    private val cards = arrayOf(
        "Ás de Copas", "Ás de Ouro", "Ás de Espadas", "Ás de Paus",
        "Dois de Copas", "Dois de Ouro", "Dois de Espadas", "Dois de Paus",
        "Três de Copas", "Três de Ouro", "Três de Espadas", "Três de Paus",
        "Quatro de Copas", "Quatro de Ouro", "Quatro de Espadas", "Quatro de Paus",
        "Cinco de Copas", "Cinco de Ouro", "Cinco de Espadas", "Cinco de Paus",
        "Seis de Copas", "Seis de Ouro", "Seis de Espadas", "Seis de Paus",
        "Sete de Copas", "Sete de Ouro", "Sete de Espadas", "Sete de Paus",
        "Oito de Copas", "Oito de Ouro", "Oito de Espadas", "Oito de Paus",
        "Nove de Copas", "Nove de Ouro", "Nove de Espadas", "Nove de Paus",
        "Dez de Copas", "Dez de Ouro", "Dez de Espadas", "Dez de Paus",
        "Valete de Copas", "Valete de Ouro", "Valete de Espadas", "Valete de Paus",
        "Dama de Copas", "Dama de Ouro", "Dama de Espadas", "Dama de Paus",
        "Rei de Copas", "Rei de Ouro", "Rei de Espadas", "Rei de Paus"
    )

    private val player: Int by lazy {
        intent.getIntExtra("player", 1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
    }

    fun drawCard(view: View) {
        val cartaTextView = findViewById<TextView>(R.id.cartaTextView)
        val drawButton = findViewById<Button>(R.id.drawButton)

        val randomCard = cards.random()
        cartaTextView.text = randomCard

        drawButton.isEnabled = false // Impede múltiplos cliques no botão
    }

    fun backToMain(view: View) {
        finish()
    }
}
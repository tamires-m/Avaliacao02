package com.example.avaliao02


import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.avaliacao02.MainActivity3
import com.example.avaliacao02.R

class MainActivity : AppCompatActivity() {

    private val cartas = mutableListOf(
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

    private val cartasArray1 = mutableListOf<String>()
    private val cartasArray2 = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Embaralhe o array de países
        cartas.shuffle()

        // Separe os países nos dois arrays alternadamente
        for (i in 0 until cartas.size) {
            if (i % 2 == 0) {
                cartasArray1.add(cartas[i])
                val textViewCarta = findViewById<TextView>(R.id.textViewCarta)


                // Converta os arrays em strings e exiba nas Views

                textViewCarta.text = "Cartas sorteadas:\n${cartasArray1.joinToString(", ")}"
            } else {
                cartasArray2.add(cartas[i])

                val textViewCarta = findViewById<TextView>(R.id.textViewCarta)


                // Converta os arrays em strings e exiba nas Views

                textViewCarta.text = "Cartas sorteadas:\n${cartasArray2.joinToString(", ")}"
            }
        }
// Encontre as Views para exibir os arrays

        // Inicie a SecondActivity e passe os arrays como extras
        val intent = Intent(this, MainActivity3::class.java)
        intent.putStringArrayListExtra("cartasArray1", ArrayList(cartasArray1))
        intent.putStringArrayListExtra("cartasArray2", ArrayList(cartasArray2))
        startActivity(intent)
    }
}


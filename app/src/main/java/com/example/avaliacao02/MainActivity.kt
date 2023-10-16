package com.example.avaliacao
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.avaliacao02.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startGame(player: Int) {
        val intent = Intent(this, CardActivity::class.java)
        intent.putExtra("player", player)
        startActivity(intent)
    }

    fun onPlayer1Click(view: View) {
        startGame(1)
    }

    fun onPlayer2Click(view: View) {
        startGame(2)
    }

    fun onFinishClick(view: View) {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
}


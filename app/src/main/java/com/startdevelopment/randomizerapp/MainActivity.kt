package com.startdevelopment.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DiceButton: Button = findViewById(R.id.DiceButton)
        DiceButton.setOnClickListener {
            val intent=Intent(it.context,DiceActivity::class.java)
            startActivity(intent)
        }

        val FlipCoinButton:Button=findViewById(R.id.FlipCoinButton)
        FlipCoinButton.setOnClickListener {
            val intent=Intent(it.context,CoinActivity::class.java)
            startActivity(intent)
        }



    }
}
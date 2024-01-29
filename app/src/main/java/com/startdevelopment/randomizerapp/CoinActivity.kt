package com.startdevelopment.randomizerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class CoinActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        val toolbar: Toolbar =findViewById(R.id.CoinToolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        //------------------------------------------------------------
        val button:Button=findViewById(R.id.FlipButton)
        val imageView: ImageView =findViewById(R.id.CoinImageView)
        button.setOnClickListener {
            val randomNumber=(1..2).random()
            val drawableResource=when (randomNumber){
                1->R.drawable.cross
                else ->R.drawable.face
            }
            imageView.setImageResource(drawableResource)
        }
    }
    //Logica para manejar el click del boton de retroceso del actionBar.
    override fun  onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){android.R.id.home->{finish(); true}
            else -> super.onOptionsItemSelected(item)

        }
    }
}
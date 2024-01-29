package com.startdevelopment.randomizerapp

//import android.widget.Toolbar
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
        //Logica para establecer el "matherial theme" como una "actionBar".

        val toolbar:Toolbar=findViewById(R.id.DiceToolbar)
        setSupportActionBar(toolbar)

        //Logica para mostrar el boton de retroceso y ocultar el texto por defecto mostrado en el actionbar recien establecido.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //Logica del lanzamiento del dado.
        val button:Button=findViewById(R.id.RollButton)
        val imageView:ImageView=findViewById(R.id.DiceImageView)

        button.setOnClickListener {
            val randomNumber=(1..10).random()
            val drawableResource=when (randomNumber){
                1->R.drawable.alea_1
                2->R.drawable.alea_2
                3->R.drawable.alea_3
                4->R.drawable.alea_4
                5->R.drawable.alea_5
                else ->R.drawable.alea_6
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
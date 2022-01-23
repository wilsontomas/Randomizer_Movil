package com.example.randomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var RollBtn:Button;
    lateinit var FlipBtn:Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RollBtn = findViewById(R.id.Roll);
        FlipBtn = findViewById(R.id.Flip);
        RollBtn.setOnClickListener{
            RollMethod();
        }
        FlipBtn.setOnClickListener{
            FlipMethod();
        }

    }
    private fun RollMethod(){
        val intentRoll = Intent(this,Roll_Activity::class.java);
        startActivity(intentRoll);
    }

    private fun FlipMethod(){
        var intentFlip = Intent(this,Dice_Activity::class.java);
        startActivity(intentFlip);
    }
}
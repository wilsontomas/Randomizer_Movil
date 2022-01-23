package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Dice_Activity : AppCompatActivity() {
    lateinit var ImageFlipBtn:Button;
    lateinit var ImageViewSrc:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        ImageFlipBtn = findViewById(R.id.Flip_Btn);
        ImageViewSrc = findViewById(R.id.Image_Flip);
        ImageFlipBtn.setOnClickListener{
            FlipMethod();
        }
    }

    private fun FlipMethod(){
        var NumberDice:Int = (1..2).random();
        when(NumberDice){
            1->ImageViewSrc.setImageResource(R.drawable.cross);
            2->ImageViewSrc.setImageResource(R.drawable.face);
        }
    }
}
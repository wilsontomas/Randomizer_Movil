package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Dice_Activity : AppCompatActivity() {
    lateinit var imageFlipBtn:Button;
    lateinit var imageViewSrc:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        imageFlipBtn = findViewById(R.id.Flip_Btn);
        imageViewSrc = findViewById(R.id.Image_Flip);
        imageFlipBtn.setOnClickListener{
            flipMethod();
        }
    }

    private fun flipMethod(){
        val numberDice:Int = (1..2).random();
        when(numberDice){
            1->imageViewSrc.setImageResource(R.drawable.cross);
            2->imageViewSrc.setImageResource(R.drawable.face);
        }

    }
}
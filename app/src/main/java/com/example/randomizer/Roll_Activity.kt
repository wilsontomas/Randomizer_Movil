package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Roll_Activity : AppCompatActivity() {
    lateinit var rollAction:Button;
    lateinit var imageViewSrc:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        rollAction = findViewById(R.id.Roll_btn);
        imageViewSrc = findViewById(R.id.image_Roll);
        rollAction.setOnClickListener{
                rollMethod();
        }
    }
    private fun rollMethod(){
       val numberRandom:Int = (1..6).random();
       when(numberRandom){
           1->imageViewSrc.setImageResource(R.drawable.alea_1);
           2->imageViewSrc.setImageResource(R.drawable.alea_2);
           3->imageViewSrc.setImageResource(R.drawable.alea_3);
           4->imageViewSrc.setImageResource(R.drawable.alea_4);
           5->imageViewSrc.setImageResource(R.drawable.alea_5);
           6->imageViewSrc.setImageResource(R.drawable.alea_6);
       }

    }
}
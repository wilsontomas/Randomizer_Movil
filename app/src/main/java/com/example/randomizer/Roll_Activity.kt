package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Roll_Activity : AppCompatActivity() {
    lateinit var RollAction:Button;
    lateinit var ImageViewSrc:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        RollAction = findViewById(R.id.Roll_btn);
        ImageViewSrc = findViewById(R.id.image_Roll);
        RollAction.setOnClickListener{
                RollMethod();
        }
    }
    private fun RollMethod(){
       var numberRandom:Int = (1..6).random();
       when(numberRandom){
           1->ImageViewSrc.setImageResource(R.drawable.alea1);
           2->ImageViewSrc.setImageResource(R.drawable.alea2);
           3->ImageViewSrc.setImageResource(R.drawable.alea3);
           4->ImageViewSrc.setImageResource(R.drawable.alea4);
           5->ImageViewSrc.setImageResource(R.drawable.alea5);
           6->ImageViewSrc.setImageResource(R.drawable.alea6);
       }
    }
}
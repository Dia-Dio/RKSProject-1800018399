package com.example.rks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
ViewFlipper gambargerak;
ImageButton tombol3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tombol3=(ImageButton)findViewById(R.id.tombol3);
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                MainActivity3.this.startActivity(intent);
            }
        });

        int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};
        gambargerak = findViewById(R.id.gambargerak);

        for (int i =0; i<images.length; i++){
            gmbr(images[i]);
        }
        for (int image: images)
            gmbr(image);

    }
    public  void  gmbr(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        gambargerak.addView(imageView);
        gambargerak.setFlipInterval(3000);
        gambargerak.setAutoStart(true);

        gambargerak.setInAnimation(this,android.R.anim.slide_in_left);
        gambargerak.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
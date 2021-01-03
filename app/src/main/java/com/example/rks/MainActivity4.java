package com.example.rks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
ImageButton month,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        month=(ImageButton)findViewById(R.id.month);
        year=(ImageButton)findViewById(R.id.year);
    month.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity4.this, month.class);
            MainActivity4.this.startActivity(intent);
        }
    });
        year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, year.class);
                MainActivity4.this.startActivity(intent);
            }
        });
    }
}
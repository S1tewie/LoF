package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class game8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game8);
        ImageButton Vibor9 = findViewById(R.id.Vibor9);
        Vibor9.setOnClickListener(v -> {
            Intent i = new Intent(this, game9.class);
            startActivity(i);
        });
        ImageButton Vibor10 = findViewById(R.id.Vibor10);
        Vibor10.setOnClickListener(v -> {
            Intent i = new Intent(this, game9Vtoroi.class);
            startActivity(i);
        });
    }
}
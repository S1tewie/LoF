package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ImageButton Vibor3 = findViewById(R.id.Vibor3);
        ImageButton Vibor1 = findViewById(R.id.Vibor1);
        ImageButton Vibor2 = findViewById(R.id.Vibor2);
        Vibor3.setOnClickListener(v -> {
            Intent i = new Intent(this, game2.class);
            startActivity(i);
        });
        Vibor1.setOnClickListener(v -> {
            Intent i = new Intent(this, Game3Prohod.class);
            startActivity(i);
        });
        Vibor2.setOnClickListener(v -> {
            Intent i = new Intent(this, game4.class);
            startActivity(i);
        });
    }
}
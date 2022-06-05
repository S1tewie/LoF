package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        ImageButton Vibor5 = findViewById(R.id.Vibor5);
        ImageButton Vibor4 = findViewById(R.id.Vibor4);
        Vibor4.setOnClickListener(v -> {
            Intent i = new Intent(this, Game6Prohod.class);
            startActivity(i);
        });
        Vibor5.setOnClickListener(v -> {
            Intent i = new Intent(this, game5.class);
            startActivity(i);
        });
    }
}
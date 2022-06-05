package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Game3Prohod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3_prohod);
        ImageButton Vibor6 = findViewById(R.id.Vibor6);
        Vibor6.setOnClickListener(v -> {
            Intent i = new Intent(this, game3.class);
            startActivity(i);
        });
    }
}
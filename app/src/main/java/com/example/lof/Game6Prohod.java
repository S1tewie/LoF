package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Game6Prohod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game6_prohod);
        ImageButton Prohod = findViewById(R.id.Prohod);
        Prohod.setOnClickListener(v -> {
            Intent i = new Intent(this, game6vibor.class);
            startActivity(i);
        });
    }
}
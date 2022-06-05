package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class game9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game9);
        ImageButton Prohod2 = findViewById(R.id.Prohod2);
        Prohod2.setOnClickListener(v -> {
            Intent i = new Intent(this, game10.class);
            startActivity(i);
        });
    }
}
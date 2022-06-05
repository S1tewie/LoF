package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class game6vibor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game6vibor);
        ImageButton Vibor7 = findViewById(R.id.Vibor7);
        Vibor7.setOnClickListener(v -> {
            Intent i = new Intent(this, game7.class);
            startActivity(i);
        });
        ImageButton Vibor8 = findViewById(R.id.Vibor8);
        Vibor8.setOnClickListener(v -> {
            Intent i = new Intent(this, game8.class);
            startActivity(i);
        });
    }
}
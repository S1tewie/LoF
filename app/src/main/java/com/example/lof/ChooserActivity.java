package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ChooserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibory);
        ImageButton buttonVibory = findViewById(R.id.buttonVibory);
        buttonVibory.setOnClickListener(v -> {
            Intent i = new Intent(this, game.class);
            startActivity(i);
        });
    }


}
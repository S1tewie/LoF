package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class game9Vtoroi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game9_vtoroi);
        ImageButton Prohod3 = findViewById(R.id.Prohod3);
        Prohod3.setOnClickListener(v -> {
            Intent i = new Intent(this, game10.class);
            startActivity(i);
        });
    }
}
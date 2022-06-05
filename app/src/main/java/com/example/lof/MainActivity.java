package com.example.lof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv = findViewById(R.id.imageView);
        //Glide.with(this).load(R.drawable.fire).into(iv);
        Button buttonAboutGame = findViewById(R.id.AboutGame);
        Button buttonPlayButton = findViewById(R.id.playButton);
        Button buttonPersonButton = findViewById(R.id.PersonButton);
        buttonAboutGame.setOnClickListener(v -> {
            Intent i = new Intent(this, AboutGame.class);
            startActivity(i);
        });
        buttonPlayButton.setOnClickListener(v -> {
            Intent i = new Intent(this, ChooserActivity.class);
            startActivity(i);
        });
        buttonPersonButton.setOnClickListener(v -> {
            Intent i = new Intent(this, People.class);
            startActivity(i);
        });
    }

        /*Intent i;
        switch (view.getId()) {
            case R.id.AboutGame:
                i = new Intent(MainActivity.this, AboutGame.class);
                startActivity(i);
            break;
            case R.id.playButton:
                //i = new Intent(getApplicationContext(), ChooserActivity.class);
                //startActivity(i);
            break;
         }*/
}
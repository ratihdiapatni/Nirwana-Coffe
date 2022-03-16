package com.example.nirwanastudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.view;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a  ctivity_main);
    }

    public void pindah(iew view) {
        Intent intent -new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }

}
package com.myportfolioapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popMovies = (Button) findViewById(R.id.bMovies);
        popMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Popular Movies App!");
            }
        });

        Button stockHawk = (Button) findViewById(R.id.bStockHawk);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Stock Hawk App!");
            }
        });

        Button buildBigger = (Button) findViewById(R.id.bBigger);
        buildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Build it Bigger App!");
            }
        });

        Button makeMaterial = (Button) findViewById(R.id.bMaterial);
        makeMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Make it Material App!");
            }
        });

        Button ubiquitous = (Button) findViewById(R.id.bUbiquitous);
        ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Go Ubiquitous App!");
            }
        });

        Button capstone = (Button) findViewById(R.id.bCapstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("This button will launch my Capstone App!");
            }
        });
    }

    private void showToast(String text) {
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }
}

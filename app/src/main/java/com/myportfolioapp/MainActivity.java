package com.myportfolioapp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
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
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Popular Movies App!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button stockHawk = (Button) findViewById(R.id.bStockHawk);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Stock Hawk App!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buildBigger = (Button) findViewById(R.id.bBigger);
        buildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Build it Bigger App!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button makeMaterial = (Button) findViewById(R.id.bMaterial);
        makeMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Make it Material App!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button ubiquitous = (Button) findViewById(R.id.bUbiquitous);
        ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Go Ubiquitous App!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button capstone = (Button) findViewById(R.id.bCapstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Capstone App!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}

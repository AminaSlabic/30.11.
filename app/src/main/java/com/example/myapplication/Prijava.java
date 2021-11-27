package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Prijava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prijava);
        Button buttonPrijava = (Button)findViewById(R.id.button_prijava);
        final TextView textGenerateNumber4 = (TextView)findViewById(R.id.generatenumber4);
        buttonPrijava.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Prijava.this, kalk.class));
            }
        });
            TextView btn = findViewById(R.id.prijavitese);
        btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    startActivity(new Intent(Prijava.this, Registracija.class));
                }
            });
        }
    }
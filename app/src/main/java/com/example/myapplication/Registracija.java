package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registracija extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracija);
        Button buttonPrijava = (Button)findViewById(R.id.generiraj3);
        final TextView textGenerateNumber3 = (TextView)findViewById(R.id.generatenumber3);
        buttonPrijava.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Registracija.this,MainActivity.class));
            }
        });
        TextView btn=findViewById(R.id.imam);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Registracija.this,Prijava.class));
            }
        });




    }
}
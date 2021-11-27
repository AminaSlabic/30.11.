package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();


        Button buttonGenerate = (Button)findViewById(R.id.generate);
        final TextView textGenerateNumber = (TextView)findViewById(R.id.generatenumber);
        buttonGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                textGenerateNumber.setText(String.valueOf(myRandom.nextInt(10)));


                Button buttonGenerate = (Button)findViewById(R.id.generiraj);
                final TextView textGenerateNumber2 = (TextView)findViewById(R.id.generatenumber2);
                buttonGenerate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, Registracija.class));
                    }

} );}});}}
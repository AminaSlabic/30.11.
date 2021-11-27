package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kalk extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView results;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.kalk);
                num1=(EditText) findViewById(R.id.etNum1);
        num2=(EditText) findViewById(R.id.etNum2);
        add=(Button) findViewById(R.id.btnAdd);
        results=(TextView) findViewById(R.id.tvAnswer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
int sum=number1+number2;
results.setText("Odgovor:"+String.valueOf(sum));

            }
        });
    }

}

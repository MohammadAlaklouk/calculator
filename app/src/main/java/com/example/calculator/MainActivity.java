package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result;
EditText num1 ;
EditText num2;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result= findViewById(R.id.result);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        button = findViewById(R.id.button);





    }

    public void calS (View view){

        if ( !TextUtils.isEmpty( num1.getText().toString())&&
             !   TextUtils.isEmpty( num2.getText().toString())){
            double num1D = Double.parseDouble( num1.getText().toString());
            double num2D = Double.parseDouble( num2.getText().toString());
            result.setText("="+(num1D+num2D));
        }else    {
            result.setText("error");
        }





/*
        if ( TextUtils.isDigitsOnly( num1.getText().toString())&&
                TextUtils.isDigitsOnly( num2.getText().toString())){
            double num1D = Double.parseDouble( num1.getText().toString());
            double num2D = Double.parseDouble( num2.getText().toString());
            result.setText("="+(num1D+num2D));
        }else    {
            result.setText("error");
        }*/
    }public void calsub (View view){
            if (TextUtils.isDigitsOnly(num1.getText().toString()) &&
                    TextUtils.isDigitsOnly(num2.getText().toString())) {
                double num1D = Double.parseDouble(num1.getText().toString());
                double num2D = Double.parseDouble(num2.getText().toString());
                result.setText("=" + (num1D - num2D));
            } else {
                result.setText("error");
            }
        }

    }

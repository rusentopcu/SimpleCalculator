package com.example.simplecalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1Text);
        number2 = findViewById(R.id.number2Text);
        result = findViewById(R.id.resultText);
    }

    public void sum(View view) {

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter Number!");
        }
        else {
            Integer sayi1 = Integer.parseInt(number1.getText().toString());
            Integer sayi2 = Integer.parseInt(number2.getText().toString());
            int sonuc = sayi1 + sayi2;
            String strsonuc = Integer.toString(sonuc);
            result.setText(strsonuc);
        }

    }


    public void deduct(View view) {

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter Number!");
        }
        else {
            Integer sayi1 = Integer.parseInt(number1.getText().toString());
            Integer sayi2 = Integer.parseInt(number2.getText().toString());
            int sonuc = sayi1 - sayi2;
            String strsonuc = Integer.toString(sonuc);
            result.setText(strsonuc);
        }
    }

    public void multiply(View view) {
           if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter Number!");
        }
        else {
            Integer sayi1 = Integer.parseInt(number1.getText().toString());
            Integer sayi2 = Integer.parseInt(number2.getText().toString());
            int sonuc = sayi1 * sayi2;
            String strsonuc = Integer.toString(sonuc);
            result.setText(strsonuc);
        }
    }

    public void divide(View view) {
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter Number!");
        }
        else {
            Integer sayi1 = Integer.parseInt(number1.getText().toString());
            Integer sayi2 = Integer.parseInt(number2.getText().toString());
            int sonuc = sayi1 / sayi2;
            String strsonuc = Integer.toString(sonuc);
            result.setText(strsonuc);
        }
    }

}

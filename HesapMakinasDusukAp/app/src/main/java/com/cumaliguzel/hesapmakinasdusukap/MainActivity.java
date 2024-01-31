package com.cumaliguzel.hesapmakinasdusukap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberOne;
    EditText numberTwo;
    TextView resultTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOne=findViewById(R.id.number1);
        numberTwo=findViewById(R.id.number2);
        resultTxt=findViewById(R.id.resultTxt);

    }
    public  void toplama(View view){
        if(numberOne.getText().toString().matches(" ")|| numberTwo.getText().toString().matches("")){
            resultTxt.setText("Enter number");
        }
        else{
            int sayi=Integer.parseInt(numberOne.getText().toString());
            int sayi2=Integer.parseInt(numberTwo.getText().toString());
            int result=sayi+sayi2;
            resultTxt.setText("Result="+result);

        }
    }
    public  void cikartma(View view){
        if(numberOne.getText().toString().matches("")||numberTwo.getText().toString().matches("")){
        resultTxt.setText("Enter Number");
        }
        else{
            int sayi=Integer.parseInt(numberOne.getText().toString());
            int sayi2=Integer.parseInt(numberTwo.getText().toString());
            int result=sayi-sayi2;
            resultTxt.setText("Result="+result);
        }

    }
    public  void carpma(View view){
        if(numberOne.getText().toString().matches("")||numberTwo.getText().toString().matches("")){
            resultTxt.setText("Enter Number");
        }
        else{
        int sayi=Integer.parseInt(numberOne.getText().toString());
        int sayi2=Integer.parseInt(numberTwo.getText().toString());
        int result=sayi*sayi2;
        resultTxt.setText("Result"+result);
        }

    }
    public  void bolme(View view){
        if(numberOne.getText().toString().matches("")||numberTwo.getText().toString().matches("")){
            resultTxt.setText("Enter Number");
        }
        else{
            int sayi=Integer.parseInt(numberOne.getText().toString());
            int sayi2=Integer.parseInt(numberTwo.getText().toString());
            int result=sayi/sayi2;
            resultTxt.setText("Result"+result);
        }

    }
    public void temizle(View view){
        resultTxt.setText("Result=0");
        numberOne.setText("");
        numberTwo.setText("");

    }






}
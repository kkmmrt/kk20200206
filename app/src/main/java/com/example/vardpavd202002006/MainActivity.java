package com.example.vardpavd202002006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView lauk1;
    TextView lauk2;
    EditText txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       lauk1 = (TextView) findViewById(R.id.laukas1);
       lauk2 = (TextView) findViewById(R.id.textView2);
        txt1 = (EditText) findViewById(R.id.editText);
        txt2 = (EditText) findViewById(R.id.editText2);
       lauk1.setText("Pirmoji programėlė");
    }

    public void m1Click (View view){
        lauk2.setText("Paspaustas m1");
    }

    public void m2Click (View a){

        String eil1 = txt1.getText().toString();
        String eil2 = txt2.getText().toString();
        double sk1 = Double.parseDouble(eil1);
        double sk2 = Double.parseDouble(eil2);
        double suma = sk1+sk2;
        String ats = Double.toString(suma);
        lauk2.setText(ats);
    }

    public void m4Click (View a){
        String eil1 = txt1.getText().toString();
        String eil2 = txt2.getText().toString();
        double sk1 = Double.parseDouble(eil1);
        double sk2 = Double.parseDouble(eil2);
        double didesnis;
        if(sk1 > sk2){
            didesnis=sk1;
        }
        else{
            didesnis=sk2;
        }
        String ats = Double.toString(didesnis);
        lauk2.setText("didesnis "+ats);
    }


}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView text;
    Button RES;
    EditText edt1,edt2,edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.RES = findViewById(R.id.RES);
        this.edt1 = findViewById(R.id.edt1);
        this.edt2 = findViewById(R.id.edt2);
        this.edt3 = findViewById(R.id.edt3);
     this.text= findViewById(R.id.text1);
        RES.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        String t1=edt1.getText().toString();
        String t2=edt2.getText().toString();
        String t3=edt3.getText().toString();
        int a=Integer.parseInt(t1);
        int b=Integer.parseInt(t2);
        int c=Integer.parseInt(t3);
        if (a==0)
            text.setText("x= "+String.valueOf(-c/b));
        else {
            double D=b*b-4*a*c;
            if (D<0)
                text.setText("NET RESHENII");
           else  if (D==0)
                text.setText(String.valueOf(-b/(2*a)));
              else
                text.setText("x1= "+String.valueOf((-b+Math.sqrt(D))/(2*a))+" ;  x2= "+String.valueOf((-b-Math.sqrt(D))/(2*a)));
        }
    }
}
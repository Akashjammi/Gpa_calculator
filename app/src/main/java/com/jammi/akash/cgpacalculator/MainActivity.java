package com.jammi.akash.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText a;
EditText b;
EditText c;
EditText d;
EditText e;
EditText f;
EditText g;
EditText h;
EditText i;
float cgpa;
TextView gpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.pqt);
        b=findViewById(R.id.mpmc);
        c=findViewById(R.id.pad);
        d=findViewById(R.id.dbms);
        e=findViewById(R.id.sem);
        f=findViewById(R.id.ite);
        g=findViewById(R.id.mpmcl);
        h=findViewById(R.id.dbmsl);
        i=findViewById(R.id.mpmcl);
        gpa=findViewById(R.id.gpa);
    }
public  void check (View view)
{
    cgpa=
            value(a.getText().toString().charAt(0)) *4 +
            value(b.getText().toString().charAt(0))*3 +
            value(c.getText().toString().charAt(0))*3 +
            value(d.getText().toString().charAt(0))*3 +
            value(e.getText().toString().charAt(0))*3 +
            value(f.getText().toString().charAt(0))*3 +
            value(g.getText().toString().charAt(0))*2 +
            value(h.getText().toString().charAt(0))*2 +
            value(i.getText().toString().charAt(0))*2 ;
    float result = (cgpa/25);
    gpa.setText(String.valueOf(result));
}

public int value(char a)
{
    if(a=='S')
            return 10;
    if(a=='A')
    return 9;
    if(a=='B')
        return 8;
    if(a=='C')
        return 7;
    if(a=='D')
        return 6;
    if(a=='E')
        return 5;
    else
        return 0;
}



}





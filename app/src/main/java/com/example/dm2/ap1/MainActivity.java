package com.example.dm2.ap1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private Button btnsuma;
    private TextView lblsuma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        btnsuma = (Button)findViewById(R.id.btnsuma);
        lblsuma = (TextView)findViewById(R.id.suma);
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                lblsuma.setText("La suma es: "+(Integer.parseInt(valor1.getText().toString())+Integer.parseInt(valor2.getText().toString())));
            }
        });

    }
}

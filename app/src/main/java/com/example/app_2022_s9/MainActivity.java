package com.example.app_2022_s9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText val1,val2;
    TextView res;
    Button suma,resta,multi,divi;
    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = (EditText) findViewById(R.id.valor1);
        val2 = (EditText) findViewById(R.id.valor2);
        res = (TextView) findViewById(R.id.txtresultado);
        suma = (Button) findViewById(R.id.btnSuma);
        resta = (Button) findViewById(R.id.btnResta);
        multi = (Button) findViewById(R.id.btnMultiplicacion);
        divi = (Button) findViewById(R.id.btnDivision);
        salir = (Button) findViewById(R.id.btnSalir);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x, y, re;
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                re = x + y;
                res.setText(String.valueOf(re));
                //cambiarActividad();

            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x, y, re;
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                re = x - y;
                res.setText(String.valueOf(re));
                //cambiarActividad();

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x, y, re;
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                re = x * y;
                res.setText(String.valueOf(re));
                //cambiarActividad();

            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x, y, re;
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                re = x / y;
                res.setText(String.valueOf(re));
                //cambiarActividad();

            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

        public void cambiarActividad(){

                                //en que momento nos encontramos en el run
            Intent i = new Intent(getApplicationContext(), SecondActivity.class);
            i.putExtra("Resultado",res.getText());
            startActivity(i);

    }
}
package com.example.app_2022_s9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText val1,val2;
    TextView res,asignacion;
    Button suma,resta,multi,divi;
    Button salir;
    Button igual;
    String operacion ="";

    double x,y,re;

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
        igual = (Button) findViewById(R.id.btnIgual);
        asignacion=(TextView) findViewById(R.id.txtAsignacion);


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                asignacion.setText("(Suma)");
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                //re = x + y;
                operacion = "+";

                //cambiarActividad();
                //res.setText(String.valueOf(re));
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asignacion.setText("(Resta)");
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                //re = x - y;

                operacion = "-";
                //res.setText(String.valueOf(re));
                //cambiarActividad();
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asignacion.setText("(Multiplicacion)");
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                //re = x * y;
                operacion = "*";
                //res.setText(String.valueOf(re));
                //cambiarActividad();
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asignacion.setText("(Division)");
                x = Integer.parseInt(val1.getText().toString());
                y = Integer.parseInt(val2.getText().toString());
                //re = x / y;
                operacion = "/";
                //res.setText(String.valueOf(re));
                //cambiarActividad();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(operacion.equals("+")){
                    re=x+y;
                    res.setText(String.valueOf(re));
                }
                if(operacion.equals("-")){
                    re=x-y;
                    res.setText(String.valueOf(re));
                }
                if(operacion.equals("*")){
                    re=x*y;
                    res.setText(String.valueOf(re));
                }
                if(operacion.equals("/")){
                    re=x/y;
                    res.setText(String.valueOf(re));
                }

            }
        });

        }

        public void cambiarActividad () {

            //en que momento nos encontramos en el run
            Intent i = new Intent(getApplicationContext(), SecondActivity.class);
            i.putExtra("Resultado", res.getText());
            startActivity(i);
        }




}
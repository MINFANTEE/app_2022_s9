package com.example.app_2022_s9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button salir;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        salir= (Button) findViewById(R.id.btnSalir2);

        Intent i = getIntent();
        String dato = i.getStringExtra("Resultado");
        TextView mostrarResultado = findViewById(R.id.mostrarRes);
        mostrarResultado.setText(dato);


        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}

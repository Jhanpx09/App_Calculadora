package com.actividad.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton botonSuma, botonResta, botonDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botonSuma= (ImageButton) findViewById(R.id.btn_suma);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SumaActivity.class));
            }
        });


        botonResta= (ImageButton) findViewById(R.id.btn_resta);
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RestaActivity.class));
            }
        });


        botonDivision= (ImageButton) findViewById(R.id.btn_division);
        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DivisionActivity.class));
            }
        });


    }
}
package com.actividad.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton botonSuma, botonResta, botonDivision, botonMultiplicacion;
    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); //Quitar le toolbar superior al momento de emular la app


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


        botonMultiplicacion= (ImageButton) findViewById(R.id.btn_multiplicacion);
        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MultiplicacionActivity.class));
            }
        });

        salir= (Button) findViewById(R.id.exit);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}
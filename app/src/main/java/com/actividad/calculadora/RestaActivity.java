package com.actividad.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton botonRegreso;

    EditText numero1, numero2;
    ImageButton resta;
    TextView resultado;
    ImageButton borrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        botonRegreso= (ImageButton) findViewById(R.id.atras);

        botonRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RestaActivity.this, MainActivity.class));
            }
        });


        numero1 = (EditText) findViewById(R.id.num1);
        numero2 = (EditText) findViewById(R.id.num2);

        resta = (ImageButton) findViewById(R.id.restar);
        borrar = (ImageButton) findViewById(R.id.borrador);

        resta.setOnClickListener(this);
        borrar.setOnClickListener(this);

        resultado = (TextView) findViewById(R.id.result);


    }


    @Override
    public void onClick(View view) {
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();

        int int1 = Integer.parseInt(n1);
        int int2 = Integer.parseInt(n2);
        int rta = 0;

        boolean token = false;

        switch (view.getId()) {
            case R.id.restar:
                rta = int1 - int2;
                break;

            case R.id.borrador:
                resultado.setText("");
                numero1.setText("");
                numero2.setText("");
                break;
        }

        resultado.setText(""+ rta);
    }
}
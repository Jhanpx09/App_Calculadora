package com.actividad.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MultiplicacionActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton botonRegreso;
    EditText numero1, numero2;
    ImageButton multiplicacion;
    TextView resultado;
    ImageButton borrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        numero1 = (EditText) findViewById(R.id.num1);
        numero2 = (EditText) findViewById(R.id.num2);

        botonRegreso= (ImageButton) findViewById(R.id.atras);
        multiplicacion = (ImageButton) findViewById(R.id.multiplicar);
        borrar = (ImageButton) findViewById(R.id.borrador);

        resultado = (TextView) findViewById(R.id.result);

        // events
        botonRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(
                        new Intent(
                                MultiplicacionActivity.this,
                                MainActivity.class
                        )
                );
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean_action();
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                generate_result(
                        operation_multiplicar( num1, num2 )
                );
            }
        });

    }

    public void generate_result (double result) {
        resultado.setText(result + "");
    }

    public void clean_action () {
        resultado.setText("");
        numero1.setText("");
        numero2.setText("");
    }

    public double operation_multiplicar (String num_1, String num_2){
        double num1 = Integer.parseInt(num_1);
        double num2 = Integer.parseInt(num_2);

        return num1 * num2;
    }

    @Override
    public void onClick(View view) {

    }
}

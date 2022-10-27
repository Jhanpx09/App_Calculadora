package com.actividad.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class DivisionActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton botonRegreso;

    EditText numero1, numero2;
    ImageButton division;
    TextView resultado;
    ImageButton borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        // edit_text
        numero1 = (EditText) findViewById(R.id.num1);
        numero2 = (EditText) findViewById(R.id.num2);
        // image_button
        botonRegreso= (ImageButton) findViewById(R.id.atras);
        division = (ImageButton) findViewById(R.id.division);
        borrar = (ImageButton) findViewById(R.id.borrador);
        // text_view
        resultado = (TextView) findViewById(R.id.result);

        // events
        botonRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(
                        new Intent(
                                DivisionActivity.this,
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

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate_result(
                        operation_division(
                                value_number_1(),
                                value_number_2()
                        )
                );
            }
        });

    }

    public void generate_result (double result) {
        resultado.setText(result + "");
    }

    public double value_number_1 () {
        String value;
        value = numero1.getText().toString();
        if (value.length() == 0) {
            value = "0";
        }
        return Integer.parseInt(value);
    }

    public double value_number_2 () {
        String value;
        value = numero2.getText().toString();
        if (value.length() == 0) {
            value = "0";
        }
        return Integer.parseInt(value);
    }

    public void clean_action () {
        resultado.setText("");
        numero1.setText("");
        numero2.setText("");
    }

    public double operation_division (double num_1, double num_2){
        if (num_2 == 0) {
            return 0;
        } else {
            return num_1 / num_2;
        }
    }

    @Override
    public void onClick(View view) {

    }
}

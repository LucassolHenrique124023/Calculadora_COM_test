package com.example.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btnSoma, btnDiv, btnMulti, btnSub, btnLimpar;
    private EditText n1, n2;
    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //variaveis certinhas eu acho
        btnSoma = findViewById(R.id.btnSomar);
        btnDiv = findViewById(R.id.btnDividir);
        btnMulti = findViewById(R.id.btnMultiplicar);
        btnSub = findViewById(R.id.btnSubtrair);
        btnLimpar = findViewById(R.id.btnLimpar);

        n1 = findViewById(R.id.editTextText3);
        n2 = findViewById(R.id.editTextText2);
        resultado = findViewById(R.id.textViewResultado);

    }
    public void Somar(View view){

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);
        Double E = C + D ;

        resultado.setText(E.toString());

    }

    public void Subtrair(View view){

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);
        Double E = C - D ;

        resultado.setText(E.toString());

    }

    public void Multiplicar(View view){

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);
        Double E = C * D ;

        resultado.setText(E.toString());

    }

    public void Dividir(View view){

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);
        Double E = C / D ;

        resultado.setText(E.toString());
    }

    public void Limpar(View view){

        //a limpeza
        n1.setText("");
        n2.setText("");
        resultado.setText("");
    }
}
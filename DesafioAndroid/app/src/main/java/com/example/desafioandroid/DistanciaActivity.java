package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class DistanciaActivity extends AppCompatActivity {

    private EditText coordXpontoA;
    private EditText coordYpontoA;
    private EditText coordXpontoB;
    private EditText coordYpontoB;
    private TextView ResultadoDistancia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distancia);

        coordXpontoA = findViewById(R.id.editCoordenadaXPontoA);
        coordYpontoA = findViewById(R.id.editCoordenadaYPontoA);
        coordXpontoB = findViewById(R.id.editCoordenadaXPontoB);
        coordYpontoB = findViewById(R.id.editCoordenadaYPontoB);
        ResultadoDistancia = findViewById(R.id.ResultadoDistancia);

    }

    public void calcularDistancia(View view){
        try {
            double pontoAX = Double.parseDouble(coordXpontoA.getText().toString());
            double pontoAY = Double.parseDouble(coordYpontoA.getText().toString());
            double pontoBX = Double.parseDouble(coordXpontoB.getText().toString());
            double pontoBY = Double.parseDouble(coordYpontoB.getText().toString());

        }catch (Exception e){

        }
    }

    public void esconderTeclado(View view){
        InputMethodManager inputManager = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

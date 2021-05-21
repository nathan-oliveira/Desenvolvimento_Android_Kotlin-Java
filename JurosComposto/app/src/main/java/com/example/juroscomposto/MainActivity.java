package com.example.juroscomposto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txt_capital;
    private EditText txt_juros;
    private EditText txt_periodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_capital = findViewById(R.id.txt_capital);
        txt_juros = findViewById(R.id.txt_juros);
        txt_periodo = findViewById(R.id.txt_periodo);
    }

    public void calcular(View view) {
        String txtCapital = txt_capital.getText().toString();
        String txtJuros = txt_juros.getText().toString();
        String txtPeriodo = txt_periodo.getText().toString();

        Intent intent = new Intent(this, CalculoActivity.class);

        intent.putExtra("txtCapital", txtCapital);
        intent.putExtra("txtJuros", txtJuros);
        intent.putExtra("txtPeriodo", txtPeriodo);

        startActivity(intent);
    }
}
package com.example.juroscomposto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CalculoActivity extends AppCompatActivity {
    private TextView txtCapital;
    private TextView txtJuros;
    private TextView txtPeriodo;
    private TextView txtMontante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        txtCapital = findViewById(R.id.txtCapital);
        txtJuros = findViewById(R.id.txtJuros);
        txtPeriodo = findViewById(R.id.txtPeriodo);
        txtMontante = findViewById(R.id.txtMontante);

        float capital = Float.parseFloat(getIntent().getStringExtra("txtCapital"));
        float juros = Float.parseFloat(getIntent().getStringExtra("txtJuros"));
        int periodo_em_meses = Integer.parseInt(getIntent().getStringExtra("txtPeriodo"));

        txtCapital.setText("CAPITAL INVESTIDO: R$ " + getIntent().getStringExtra("txtCapital"));
        txtJuros.setText("TAXA DE JUROS: " + getIntent().getStringExtra("txtJuros") + "%");
        txtPeriodo.setText("PERÍODO: " + getIntent().getStringExtra("txtPeriodo") + " meses");

        double montante = capital * Math.pow(1 + juros/100, periodo_em_meses);
        txtMontante.setText("MONTANTE FINAL: R$ " + String.format("%.2f", montante));
    }
}
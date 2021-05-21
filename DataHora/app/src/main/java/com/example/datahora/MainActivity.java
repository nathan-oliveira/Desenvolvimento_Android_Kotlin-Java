package com.example.datahora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void obterData(View view) {
        Date data = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        TextView txtData = findViewById(R.id.txtData);
        txtData.setText(dateFormat.format(data));
    }

    public void obterHora(View view) {
        Date hora = new Date();
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH/mm/ss");

        TextView txtData = findViewById(R.id.txtData);
        txtData.setText(horaFormat.format(hora));
    }
}
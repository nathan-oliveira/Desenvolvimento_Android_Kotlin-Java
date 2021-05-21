package com.example.sorteiomegasena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumeros(View view) {
        TextView viewNumeros = findViewById(R.id.textNumeros);
        Random criarNumeroAleatorio = new Random();
        ArrayList<Integer> ArrayDeNumeros = new ArrayList<>();

        while (ArrayDeNumeros.size() < 6) {
            int numero = criarNumeroAleatorio.nextInt((60 - 1)) + 1;
            if (!ArrayDeNumeros.contains(numero)) ArrayDeNumeros.add(numero);
        }

        Collections.sort(ArrayDeNumeros);

        String textNumeros = "Os 6 números são: \n";
        for (int i = 0; i < ArrayDeNumeros.size(); i++) {
            textNumeros += ArrayDeNumeros.get(i) + " ";
        }

        viewNumeros.setText(textNumeros);
    }

}
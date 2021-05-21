package com.example.telalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginCorretoActivity extends AppCompatActivity {

    private TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_correto);

        txtMensagem = findViewById(R.id.txtMensagem);

        String usuario = getIntent().getStringExtra("usuario");
        double pi = getIntent().getDoubleExtra("pi", 0);

        txtMensagem.setText("Bem-vindo(a) "+ usuario + " ao aplicativo");
    }
}
package com.example.telalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Login> usuarios;
    private EditText edtEmail;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarios = new ArrayList<>();

        Login user1 = new Login("nathan@gmail.com", "123456", "Nathan Oliveira");
        usuarios.add(user1);

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
    }

    public void entrar(View view) {
        String email = edtEmail.getText().toString();
        String senha = edtSenha.getText().toString();

        if (email == "") {
            Toast.makeText(this, "Campo E-mail não pode ser vazio", Toast.LENGTH_LONG).show();
            edtEmail.requestFocus();
            return;
        }

        if (senha == "") {
            Toast.makeText(this, "Campo Senha não pode ser vazio", Toast.LENGTH_LONG).show();
            edtSenha.requestFocus();
            return;
        }

        Login login = buscarLoginPorEmail(email);

        if (login != null) {
            if (login.getSenha().equals(senha)) {
                Intent intent = new Intent(this, LoginCorretoActivity.class);
                intent.putExtra("usuario", login.getNome());
                intent.putExtra("pi", 3.1415);

                startActivity(intent);
            } else {
                Intent intent = new Intent(this, LoginIncorretoActivity.class);
                startActivity(intent);
            }
        } else {
            Toast.makeText(this, "Login não encontrado", Toast.LENGTH_LONG).show();
            edtEmail.requestFocus();
        }
    }

    private  Login buscarLoginPorEmail(String email) {
        for (Login login : usuarios) {
            if (login.getEmail().equals(email)) {
                return login;
            }
        }

        return null;
    }
}
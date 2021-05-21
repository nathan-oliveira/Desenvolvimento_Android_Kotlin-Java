package com.example.tabuada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getData(View view) {
        TextView viewTable = findViewById(R.id.view_table);
        EditText input = findViewById(R.id.txt_number);

        if (input.getText().length() == 0) {
            Toast.makeText(this,"Ops! Campo obrigatório.", Toast.LENGTH_LONG).show();
            return;
        }

        int inputNumber = Integer.parseInt(input.getText().toString().trim());
        if (inputNumber < 1 && inputNumber > 10) {
            Toast.makeText(this,"Ops! Só é permitido apenas número de 1 á 10.", Toast.LENGTH_LONG).show();
            return;
        }

        String textView = "";
        for (int i = 1; i <= 10; i++) {
            textView += inputNumber + " x " + i + " = " + inputNumber * i + "\n";
        }

        viewTable.setText(textView);
    }

    public void clearInput(View view) {
        TextView viewTable = findViewById(R.id.view_table);
        EditText inputNumber = findViewById(R.id.txt_number);
        inputNumber.setText("");
        viewTable.setText("");
    }
}
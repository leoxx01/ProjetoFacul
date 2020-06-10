
package com.example.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class cadastro extends AppCompatActivity {
    String nome = null;
    String email = null;
    String senha = null;
    String confirmationsenha = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void cadastrar(View view){
        EditText camponome = findViewById(R.id.editText);
        EditText campoemail = findViewById(R.id.editText2);
        EditText camposenha = findViewById(R.id.editText5);
        EditText campoconfirm = findViewById(R.id.editText4);

        nome = camponome.getText().toString();
        email = campoemail.getText().toString();
        senha = camposenha.getText().toString();
        confirmationsenha = campoconfirm.getText().toString();

        Toast.makeText(cadastro.this, "Cadastro Efetuado Com Sucesso", Toast.LENGTH_LONG).show();
    }
}

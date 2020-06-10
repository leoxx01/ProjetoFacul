package com.example.aplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class perfil extends AppCompatActivity {

    private AlteredCharSequence Snackbar;
    String camponome = null;
    String campoemail = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void sair(View view){
       finish();
       System.exit(0);
    }
    public void buyitem(View view){
        Intent chamar = new Intent(this, buy.class);
        startActivity(chamar);
    }
    public void editar(View view){
        Button editarbtn = findViewById(R.id.button4);
        Button salvar = findViewById(R.id.button8);

        EditText nome = findViewById(R.id.editText3);
        EditText email = findViewById(R.id.editText6);

        TextView labelum = findViewById(R.id.textView4);
        TextView labeldois = findViewById(R.id.textView3);

        salvar.setVisibility(View.VISIBLE);
        nome.setVisibility(View.VISIBLE);
        email.setVisibility(View.VISIBLE);

        editarbtn.setVisibility(View.INVISIBLE);
        labelum.setVisibility(View.INVISIBLE);
        labeldois.setVisibility(View.INVISIBLE);
    }
    public void salvar(View view){
        Button editarbtn = findViewById(R.id.button4);
        Button salvar = findViewById(R.id.button8);

        EditText nome = findViewById(R.id.editText3);
        EditText email = findViewById(R.id.editText6);

        TextView labelum = findViewById(R.id.textView4);
        TextView labeldois = findViewById(R.id.textView3);

        camponome  = nome.getText().toString();
        campoemail = nome.getText().toString();

        salvar.setVisibility(View.INVISIBLE);
        nome.setVisibility(View.INVISIBLE);
        email.setVisibility(View.INVISIBLE);

        editarbtn.setVisibility(View.VISIBLE);
        labelum.setVisibility(View.VISIBLE);
        labeldois.setVisibility(View.VISIBLE);


        Toast.makeText(perfil.this, "Alteração Efetuada Com Sucesso", Toast.LENGTH_LONG).show();
    }

}

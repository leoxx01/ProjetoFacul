package com.example.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teste(View view){
        Intent chamar = new Intent(this, perfil.class);
        startActivity(chamar);

    }
    public  void cadastro(View view){
        Intent chamar = new Intent(this, cadastro.class);
        startActivity(chamar);
    }
}

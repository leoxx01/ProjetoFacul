package com.example.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class buy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
    }
    public void sair(View view){
        finish();
        System.exit(0);
    }
    public void perfilcall(View view){
        Intent chamar = new Intent(this, perfil.class);
        startActivity(chamar);
    }
}

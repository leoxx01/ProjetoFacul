package com.example.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lista = (ListView) findViewById(R.id.list_view1);
        ArrayList<String> templates = preencherdados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, templates);
        lista.setAdapter(arrayAdapter);
    }


    private ArrayList<String> preencherdados(){
        ArrayList<String> dados = new ArrayList<String >();
            dados.add("Template 1");
            dados.add("Template 2");
            dados.add("Template 3");
        return dados;
    }
    public void add_car(AdapterView<?> a, View v, int position, long id){
        Object obj = a.getItemAtPosition(position);

        String mensagem = "Cliente Selecionado: " + obj;

        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
    }
}


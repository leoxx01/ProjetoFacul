package com.example.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class princiapl extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princiapl);

        ListView lista = (ListView) findViewById(R.id.list_view1);
        ArrayList<String> templates = preencherdados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, templates);
        lista.setAdapter(arrayAdapter);
    }
    private static ArrayList<String> preencherdados(){
        ArrayList<String> dados = new ArrayList<String >();
        dados.add("Template 1");
        dados.add("Template 2");
        dados.add("Template 3");
        return dados;
    }
    public void add_car(View view){

    }
    public void showProfile(View view){

    }
}

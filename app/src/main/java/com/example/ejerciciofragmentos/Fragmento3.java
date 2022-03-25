package com.example.ejerciciofragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class Fragmento3 extends Fragment {


    Button botonAgregar;
    ListView lst;
    EditText entrada;
    ArrayList<String> alista = new ArrayList<>();
    ArrayAdapter<String> adaptador;

    String nombre = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmento3, container, false);


        botonAgregar = v.findViewById(R.id.btnFavoritos);
        lst = v.findViewById(R.id.lstFavoritos);
        entrada = v.findViewById(R.id.txtEntradaFavoritos);

        botonAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre = entrada.getText().toString();
                alista.add(nombre);

                adaptador = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, alista);

                lst.setAdapter(adaptador);
            }
        });


        return v;
    }
}
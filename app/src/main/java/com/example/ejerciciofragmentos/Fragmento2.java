package com.example.ejerciciofragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Fragmento2 extends Fragment {
    Button botonBuscar;
    EditText entradaBusqueda;
    EditText resultadoBusqueda;
    ImageView imgBusqueda;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmento2, container, false);

        botonBuscar = v.findViewById(R.id.bntBuscar);
        entradaBusqueda = v.findViewById(R.id.txtBuscarVerdura);
        resultadoBusqueda = v.findViewById(R.id.txtResultadoBusqueda);
        imgBusqueda = v.findViewById(R.id.imgBusqueda);

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entradaBusqueda.getText().toString().equals("limon")){
                    resultadoBusqueda.setText("Limon Si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.limon);
                }
                if(entradaBusqueda.getText().toString().equals("repollo")){
                    resultadoBusqueda.setText("Repollo si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.repollo);
                }
                if(entradaBusqueda.getText().toString().equals("tomate")){
                    resultadoBusqueda.setText("Tomate si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.tomate);
                }
                if(entradaBusqueda.getText().toString().equals("cebolla")){
                    resultadoBusqueda.setText("Cebolla si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.cebolla);
                }
                if(entradaBusqueda.getText().toString().equals("berenjena")){
                    resultadoBusqueda.setText("Berenjena si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.berengena);
                }
                if(entradaBusqueda.getText().toString().equals("papa")){
                    resultadoBusqueda.setText("Papa si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.papa);
                }
                if(entradaBusqueda.getText().toString().equals("pepino")){
                    resultadoBusqueda.setText("Pepino si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.pepino);
                }
                if(entradaBusqueda.getText().toString().equals("pimenton")){
                    resultadoBusqueda.setText("Pimenton si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.pimenton);
                }
                if(entradaBusqueda.getText().toString().equals("zapallo")){
                    resultadoBusqueda.setText("Zapallo si se encuentra en la lista");
                    imgBusqueda.setImageResource(R.drawable.zapallo);
                }
                if(entradaBusqueda.getText().toString().equals("")){
                    Toast.makeText(getContext(), "INGRESE VERDURA", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Esta verdura no se encuentra en la lista", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return v;
    }
}
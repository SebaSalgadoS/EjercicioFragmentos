package com.example.ejerciciofragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;


public class Fragmento4 extends Fragment {

    Button bntEscoger;
    RadioButton rdNotificaciones;
    RadioButton rdNoNotificaciones;

    Button btnSaber;
    CheckBox chFavoritos;
    CheckBox chOfertas;
    CheckBox chAhorroDatos;
    CheckBox chSincronizacionDatos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmento4, container, false);

        bntEscoger = v.findViewById(R.id.bntescoger);
        rdNoNotificaciones = v.findViewById(R.id.rdNoRecibirNotificaciones);
        rdNotificaciones = v.findViewById(R.id.rdRecibirNotificaciones);

        bntEscoger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rdNotificaciones.isChecked()){
                    Toast.makeText(getContext(), "Usted a Seleccionado Recibir Notificaciones ", Toast.LENGTH_SHORT).show();
                }
                if(rdNoNotificaciones.isChecked()){
                    Toast.makeText(getContext(), "Usted a Seleccionado No Recibir Notificaciones ", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnSaber = v.findViewById(R.id.btnSaber);
        chAhorroDatos = v.findViewById(R.id.chAhorroDatos);
        chFavoritos = v.findViewById(R.id.chfavoritos);
        chOfertas = v.findViewById(R.id.chOfertas);
        chSincronizacionDatos = v.findViewById(R.id.chSinconizacionDatos);

        btnSaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seleccion = "Elegiste: ";

                if(chAhorroDatos.isChecked()){
                    seleccion += " Ahorro de Datos -";
                }
                if(chFavoritos.isChecked()){
                    seleccion += " Mostrar Favoritos como publico - ";
                }
                if(chOfertas.isChecked()){
                    seleccion +=" Recibir Ofertas al e-mail - ";
                }
                if(chSincronizacionDatos.isChecked()){
                    seleccion +=" Sincronizacion de datos - ";
                }
                if(seleccion.equals("Elegiste: ")){
                    seleccion = " Debe seleccionar al menos una opcion de consola";
                }

                Toast.makeText(getContext(), seleccion, Toast.LENGTH_SHORT).show();

            }
        });

        return v;
    }
}
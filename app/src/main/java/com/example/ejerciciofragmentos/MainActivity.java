package com.example.ejerciciofragmentos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    // FRAGMENTOS
    Fragmento1 f1 = new Fragmento1();
    Fragmento2 f2 = new Fragmento2();
    Fragmento3 f3 = new Fragmento3();
    Fragmento4 f4 = new Fragmento4();

    BottomNavigationView bottom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FRAGMENTOS



        bottom = findViewById(R.id.myBottomNavigationView);

        bottom.setOnItemSelectedListener(this::onNavigationItemSelected);
        cargarFragmento(f1);

    }




    public void cargarFragmento(Fragment f) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.myFrame, f);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.itemHome:
                cargarFragmento(f1);
                return true;
            case R.id.itemBusqueda:
                cargarFragmento(f2);
                return true;
            case R.id.itemFavoritos:
                cargarFragmento(f3);
                return true;
            case R.id.itemConfig:
                cargarFragmento(f4);
                return true;

        }
        return false;
    }
}
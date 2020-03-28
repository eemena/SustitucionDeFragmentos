package com.nextu.sustituciondefragmentos;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        ListaDePlanetas listaDePlanetas = new ListaDePlanetas();
        fragmentTransaction.add(R.id.lista_de_planetas, listaDePlanetas);
        fragmentTransaction.commit();

    }


}

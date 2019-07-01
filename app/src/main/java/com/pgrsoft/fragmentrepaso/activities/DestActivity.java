package com.pgrsoft.fragmentrepaso.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;

import com.pgrsoft.fragmentrepaso.R;
import com.pgrsoft.fragmentrepaso.menuInterface.ComunicaMenu;
import com.pgrsoft.fragmentrepaso.packagefragment.AFragment;
import com.pgrsoft.fragmentrepaso.packagefragment.BFragment;
import com.pgrsoft.fragmentrepaso.packagefragment.CFragment;
import com.pgrsoft.fragmentrepaso.packagefragment.DFragment;


public class DestActivity extends AppCompatActivity implements ComunicaMenu {


    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dest);

        fragments = new Fragment[4];

        fragments[0] = new AFragment();
        fragments[1] = new BFragment();
        fragments[2] = new CFragment();
        fragments[3] = new DFragment();

        Bundle extras = getIntent().getExtras();

        menu(extras.getInt("BOTON_PULSADO"));


    }


    @Override
    public void menu(int botonPulsado) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.destino, fragments[botonPulsado]);
        fragmentTransaction.commit();


    }
}

package com.pgrsoft.fragmentrepaso.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.pgrsoft.fragmentrepaso.R;
import com.pgrsoft.fragmentrepaso.menuInterface.ComunicaMenu;

public class MainActivity extends AppCompatActivity implements ComunicaMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void menu(int botonPulsado) {

        // Cambiamos de actividad
        Intent intent = new Intent(this, DestActivity.class);

        intent.putExtra("BOTON_PULSADO", botonPulsado);
        startActivity(intent);

    }
}

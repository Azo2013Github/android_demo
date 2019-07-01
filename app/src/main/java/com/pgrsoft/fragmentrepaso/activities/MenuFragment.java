package com.pgrsoft.fragmentrepaso.activities;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.pgrsoft.fragmentrepaso.R;
import com.pgrsoft.fragmentrepaso.menuInterface.ComunicaMenu;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    private final int[] BOTONES_MENU = {R.id.boton1,
                                        R.id.boton2,
                                        R.id.boton3,
                                        R.id.boton4};

    public MenuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miMenu = inflater.inflate(R.layout.fragment_menu, container, false);

        ImageButton botonMenu;

        for (int i = 0; i< BOTONES_MENU.length; i++){

            botonMenu = (ImageButton) miMenu.findViewById(BOTONES_MENU[i]);

            final int BOTON_i = i;

            botonMenu.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    Activity actividadActual = getActivity();

                    Log.d("****", " Pulsado y enviamos info del boton: "+BOTON_i);

                    ComunicaMenu cm = (ComunicaMenu) actividadActual;
                    cm.menu(BOTON_i);

                }
            });
        }

        return miMenu;

    }

}

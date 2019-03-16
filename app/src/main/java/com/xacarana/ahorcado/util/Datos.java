package com.xacarana.ahorcado.util;

import android.app.Application;

import com.xacarana.ahorcado.logica.Puntaje;

/**
 * Created by User on 25/09/2016.
 */
public class Datos extends Application {

    private Puntaje puntaje;
    /*Toast.makeText(Juego.this,
    ""+getBaseContext().getResources().getDisplayMetrics().widthPixels, Toast.LENGTH_SHORT).show();*/
    public Puntaje getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Puntaje puntaje) {
        this.puntaje = puntaje;
    }

}

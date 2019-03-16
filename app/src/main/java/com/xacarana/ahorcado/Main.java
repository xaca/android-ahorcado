package com.xacarana.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.xacarana.ahorcado.logica.Puntaje;
import com.xacarana.ahorcado.util.Datos;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intent intent = new Intent(Main.this,SeleccionCategoria.class);
        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(""+R.string.debug_name,"Run bitch");
                final Intent mainIntent = new Intent(Main.this, SeleccionCategoria.class);
                Main.this.startActivity(mainIntent);
                Main.this.finish();
            }
        },R.string.tiempo_splash);*/
        ((Datos)this.getApplication()).setPuntaje(new Puntaje());
        Timer t = new Timer();
        t.schedule(new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Main.this, SeleccionCategoria.class);
                startActivity(intent);
                Main.this.finish();
            }
        }, 3000);


    }
}

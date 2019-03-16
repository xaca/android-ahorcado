package com.xacarana.ahorcado;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.xacarana.ahorcado.logica.Puntaje;
import com.xacarana.ahorcado.util.Datos;

public class SeccionPuntaje extends Activity {
    private Puntaje puntaje;
    TextView humano, pc;
    ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntaje);
        puntaje = ((Datos)this.getApplication()).getPuntaje();
        humano = (TextView) findViewById(R.id.txt_humano);
        pc = (TextView) findViewById(R.id.txt_pc);
        humano.setText(""+puntaje.getPuntajeHumano());
        pc.setText(""+puntaje.getPuntajePC());
        ib = (ImageButton) findViewById(R.id.imageButton2);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}

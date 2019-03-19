package com.xacarana.ahorcado;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.xacarana.ahorcado.logica.LogicaAhorcado;
import com.xacarana.ahorcado.util.Datos;

import java.util.Timer;
import java.util.TimerTask;

public class Juego extends Activity implements View.OnClickListener{

    LogicaAhorcado la;
    TextView tv, po;
    ImageView iv;
    ImageButton ib;
    int estado_partida;
    int imagenes_juego[] = {R.drawable.ahorcado_01, R.drawable.ahorcado_02, R.drawable.ahorcado_03, R.drawable.ahorcado_04, R.drawable.ahorcado_05, R.drawable.ahorcado_06, R.drawable.ahorcado_07};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        tv = (TextView) findViewById(R.id.categoria_seleccionada);
        po = (TextView) findViewById(R.id.palabraOculta);
        iv = (ImageView) findViewById(R.id.imageView2);
        ib = (ImageButton) findViewById(R.id.imageButton);
        iv.setImageResource(imagenes_juego[0]);
        la = new LogicaAhorcado();
        la.seleccionarCategoria(Integer.parseInt(getIntent().getStringExtra("categoria")));
        la.setCategorias(getResources().getStringArray(R.array.lista_categorias));
        tv.setText(la.getNombreCategoria());
        po.setText(la.getProgresoPalabra());
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Juego.this, SeccionPuntaje.class);
                startActivity(intent);

            }
        });
        estado_partida = LogicaAhorcado.CONTINUAR_PARTIDA;
        la.setPuntaje(((Datos)this.getApplication()).getPuntaje());
        la.resetJuego();
        crearTeclado();
    }

    public String getLetra(int i)
    {
        return "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".substring(i, i+1);
    }

    public void crearTeclado(){
        GridLayout gl = (GridLayout) findViewById(R.id.teclado);
        GridLayout.LayoutParams lp;
        int contador  = 0, size, fuente;
        int ancho = getBaseContext().getResources().getDisplayMetrics().widthPixels;
        Button btn;

        size = ancho <= 480? 38 : 50;
        fuente = ancho <= 480?15:22;

        for(int i= 0;i<gl.getRowCount();i++)
        {
            for(int j=0;j<gl.getColumnCount();j++)
            {
                lp = new GridLayout.LayoutParams(GridLayout.spec(i), GridLayout.spec(j));
                btn = new Button(this);
                btn.setOnClickListener(this);
                btn.setId(contador);
                btn.setText(getLetra(contador++));
                btn.setTextSize(fuente);
                btn.setWidth(size);
                btn.setHeight(size);
                gl.addView(btn,lp);

            }
        }
    }

    @Override
    public void onClick(View view) {
        //Log.d("CLICK",""+view.getId());

        view.setEnabled(false);
        if(la.validarLetra(getLetra(view.getId()).toLowerCase().charAt(0))) {
            view.setBackgroundColor(Color.GREEN);
        }
        else
        {
            view.setBackgroundColor(Color.RED);
        }

        po.setText(la.getProgresoPalabra());
        estado_partida = la.ganoPartida();
        switch (estado_partida)
        {
            case LogicaAhorcado.GANO_PARTIDA:
                mostrarMensaje(getString(R.string.gano_partida));
                break;
            case LogicaAhorcado.PERDIO_PARTIDA:
                iv.setImageResource(imagenes_juego[la.getErrores()]);
                mostrarMensaje(getString(R.string.perdio_partida));
                break;
            case LogicaAhorcado.CONTINUAR_PARTIDA:
                iv.setImageResource(imagenes_juego[la.getErrores()]);
                break;
        }
        ((Datos)this.getApplication()).setPuntaje(la.getPuntaje());
    }

    public void mostrarMensaje(String mensaje){
        new AlertDialog.Builder(this)
                .setTitle("")
                .setMessage(mensaje)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete

                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Juego.this, SeleccionCategoria.class);
                startActivity(intent);
            }
        }, 2000);
        /*.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // do nothing
            }
        })*/
    }
}

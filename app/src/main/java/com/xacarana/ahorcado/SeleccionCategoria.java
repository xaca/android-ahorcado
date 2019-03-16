package com.xacarana.ahorcado;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SeleccionCategoria extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        setListAdapter(new CustomListAdapter(this,
                android.R.layout.simple_list_item_1,
                R.id.texto_categoria,
                getResources().getStringArray(R.array.lista_categorias)));
        final ListView lv = (ListView) findViewById(android.R.id.list);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SeleccionCategoria.this,Juego.class);
                intent.putExtra("categoria",""+i);
                /*Toast.makeText(getBaseContext(),
                map.get("name").toString(),
                        Toast.LENGTH_LONG).show();*/
                //intent.putExtra("categoria",""+adapterView.getItemAtPosition(i));
                startActivity(intent);
            }
        });
    }
}

package com.xacarana.ahorcado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 18/09/2016.
 */
public class CustomListAdapter extends ArrayAdapter<String> {

    private int[] img_categorias = {
            R.drawable.categoria_peliculas, R.drawable.categoria_cine,
            R.drawable.categoria_deportes, R.drawable.categoria_frutas,
            R.drawable.categoria_musica, R.drawable.categoria_paises};

    public CustomListAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = li.inflate(R.layout.list_item,parent,false);
        String items[] = getContext().getResources().getStringArray(R.array.lista_categorias);
        ImageView iv = (ImageView) row.findViewById(R.id.logo_categoria);
        TextView tv = (TextView) row.findViewById(R.id.texto_categoria);

        //Log.w("Error"," iv "+iv+" tv "+tv+" "+items[position]);
        tv.setText(items[position]);
        iv.setImageResource(img_categorias[position]);
        return row;
    }
}

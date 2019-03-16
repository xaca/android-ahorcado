package com.xacarana.ahorcado.logica;

import java.util.Random;

/**
 * Created by User on 25/09/2016.
 */
public class InventarioCategorias {

    private String categorias[];
    private String palabras[][];
    private int categoria_actual;

    public InventarioCategorias()
    {
        palabras = new String[6][10];
        //categorias = new String[] { "Actores", "Películas", "Deportes", "Frutas", "Grupos de Musica", "Países" };

        palabras[0][0] = "al pacino";
        palabras[0][1] = "arnold schwarzenegger";
        palabras[0][2] = "sylvester stallone";
        palabras[0][3] = "adam sandler";
        palabras[0][4] = "uma thurman";
        palabras[0][5] = "monica bellucci";
        palabras[0][6] = "jim carrey";
        palabras[0][7] = "vincent cassel";
        palabras[0][8] = "brad pitt";
        palabras[0][9] = "angelina jolie";

        palabras[1][0] = "matrix";
        palabras[1][1] = "snatch";
        palabras[1][2] = "rambo";
        palabras[1][3] = "terminator";
        palabras[1][4] = "los increibles";
        palabras[1][5] = "dumbo";
        palabras[1][6] = "madmax";
        palabras[1][7] = "cobra";
        palabras[1][8] = "shrek";
        palabras[1][9] = "hercules";

        palabras[2][0] = "baloncesto";
        palabras[2][1] = "natacion";
        palabras[2][2] = "boxeo";
        palabras[2][3] = "billar";
        palabras[2][4] = "tenis de mesa";
        palabras[2][5] = "ciclismo";
        palabras[2][6] = "balonmano";
        palabras[2][7] = "voleibol";
        palabras[2][8] = "lucha";
        palabras[2][9] = "futbol";

        palabras[3][0] = "mango";
        palabras[3][1] = "papaya";
        palabras[3][2] = "cereza";
        palabras[3][3] = "fresa";
        palabras[3][4] = "sandia";
        palabras[3][5] = "granadilla";
        palabras[3][6] = "coco";
        palabras[3][7] = "guayaba";
        palabras[3][8] = "kiwi";
        palabras[3][9] = "uchuva";

        palabras[4][0] = "blur";
        palabras[4][1] = "nirvana";
        palabras[4][2] = "metallica";
        palabras[4][3] = "cafe tacuba";
        palabras[4][4] = "soda estereo";
        palabras[4][5] = "aterciopelados";
        palabras[4][6] = "molotov";
        palabras[4][7] = "dos minutos";
        palabras[4][8] = "caifanes";
        palabras[4][9] = "bajo fondo";

        palabras[5][0] = "noruega";
        palabras[5][1] = "grecia";
        palabras[5][2] = "holanda";
        palabras[5][3] = "españa";
        palabras[5][4] = "nicaragua";
        palabras[5][5] = "honduras";
        palabras[5][6] = "rumania";
        palabras[5][7] = "kuwait";
        palabras[5][8] = "puerto rico";
        palabras[5][9] = "polonia";
    }

    public String palabraAleatoria(int categoria){
        Random rnd = new Random();
        int min = 0, max = palabras[0].length-1;
        setCategoria_actual(categoria);
        return palabras[getCategoria_actual()][rnd.nextInt((max - min) + 1) + min];
    }

    public void setCategorias(String[] categorias)
    {
        this.categorias = categorias;
    }

    public String getNombreCategoria(int id_categoria)
    {
        return categorias[id_categoria];
    }

    public int getCategoria_actual() {
        return categoria_actual;
    }

    public void setCategoria_actual(int categoria_actual) {
        this.categoria_actual = categoria_actual;
    }
}

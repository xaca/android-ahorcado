package com.xacarana.ahorcado.logica;

/**
 * Created by User on 21/09/2016.
 */
public class ModeloCategorias {

    private int categoriaActual;
    private String palabraActual;
    private int lnPalabraActual;
    private String nombreCategoria;
    private StringBuilder datos[];
    private String[] categorias;

    public ModeloCategorias()
    {
        datos = new StringBuilder[6];
        datos[0] = new StringBuilder("futbol,baloncesto,natacion,boxeo,billar,tenis de mesa,ciclismo,balonmano,voleibol,lucha");
        datos[1] = new StringBuilder("blur,nirvana,metallica,cafe tacuba,soda estereo,aterciopelados,molotov,dos minutos,caifanes,bajo fondo");
        datos[2] = new StringBuilder("noruega,grecia,holanda,españa,nicaragua,honduras,rumania,kuwait,puerto rico,polonia");
        datos[3] = new StringBuilder("mango,papaya,cereza,fresa,sandia,granadilla,coco,guayaba,kiwi,uchuva");
        datos[4] = new StringBuilder("matrix,snatch,rambo,terminator,los increibles,dumbo,madmax,cobra,shrek,hercules");
        datos[5] = new StringBuilder("al pacino,arnold schwarzenegger,sylvester stallone,adam sandler,uma thurman,monica bellucci,jim carrey,vincent cassel,brad pitt,angelina jolie");
    }

    public void seleccionarPalabra(){
        String ans[] = datos[getCategoriaActual()].toString().split(",");
        setPalabraActual(ans[(int)(Math.random()*ans.length)]);
    }

    public String getNombreCategoria(){
        return categorias[this.getCategoriaActual()];
    }

    public int getCategoriaActual() {
        return categoriaActual;
    }

    public void setCategoriaActual(int categoriaActual) {
        this.categoriaActual = categoriaActual;
    }

    public String getPalabraActual() {
        return palabraActual;
    }

    public void setPalabraActual(String palabraActual) {
        this.palabraActual = palabraActual;
    }

    public int getLongitudPalabraActual() {
        return getPalabraActual().length();
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }
}

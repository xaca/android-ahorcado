package com.xacarana.ahorcado.logica;

/**
 * Created by User on 19/09/2016.
 */
public class LogicaAhorcado {

    public static final int GANO_PARTIDA = 1;
    public static final int PERDIO_PARTIDA = 2 ;
    public static final int CONTINUAR_PARTIDA = 3;
    private Puntaje puntaje;
    private PalabraSecreta ps;
    private InventarioCategorias ic;

    public LogicaAhorcado()
    {
        ps = new PalabraSecreta();
        ic = new InventarioCategorias();
    }

    public boolean seleccionarCategoria(int categoria)
    {
        ps.setPalabra_secreta(ic.palabraAleatoria(categoria));
        return ps.getProgresoPalabra() != null;
    }
    public void setCategorias(String[] categorias) {
        ic.setCategorias(categorias);
    }
    public String getNombreCategoria()
    {
        return ic.getNombreCategoria(ic.getCategoria_actual());
    }
    public String getProgresoPalabra()
    {
        return ps.getProgresoPalabra();
    }
    public void resetJuego()
    {
        getPuntaje().resetJuego();
    }
    public int getErrores()
    {
        return getPuntaje().getErrores();
    }
    public boolean validarLetra(char letra)
    {
        boolean exito = ps.adivinarLetra(letra);
        if(exito)
        {
            getPuntaje().incrementarAciertos();
        }
        else
        {
            getPuntaje().incrementarErrores();
        }
        return exito;
    }
    public int ganoPartida()
    {
        if(ps.adivinoPalabra()) {
            getPuntaje().incrementarPuntajeHumano();
            return GANO_PARTIDA;
        }
        else
        {
            if(getPuntaje().getErrores() == 6) {
                getPuntaje().incrementarPuntajePC();
                return PERDIO_PARTIDA;
            }
            else {
                return CONTINUAR_PARTIDA;
            }
        }
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Puntaje puntaje) {
        this.puntaje = puntaje;
    }
}

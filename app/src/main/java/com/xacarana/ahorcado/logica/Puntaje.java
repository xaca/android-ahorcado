package com.xacarana.ahorcado.logica;

/**
 * Created by User on 25/09/2016.
 */
public class Puntaje {

    private int puntajeHumano;
    private int puntajePC;
    private int errores;
    private int aciertos;
    private int puntos;

    public Puntaje()
    {
        puntos = 1;
    }

    public void resetJuego()
    {
        setErrores(aciertos = 0);
    }

    public void incrementarAciertos()
    {
        this.aciertos += puntos;
    }

    public void incrementarErrores()
    {
        this.setErrores(this.getErrores() + 1);
    }

    public void incrementarPuntajeHumano(){this.puntajeHumano++;}

    public void incrementarPuntajePC(){this.puntajePC++;}

    public int getPuntajeHumano() {
        return puntajeHumano;
    }

    public void setPuntajeHumano(int puntajeHumano) {
        this.puntajeHumano = puntajeHumano;
    }

    public int getPuntajePC() {
        return puntajePC;
    }

    public void setPuntajePC(int puntajePC) {
        this.puntajePC = puntajePC;
    }

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
}

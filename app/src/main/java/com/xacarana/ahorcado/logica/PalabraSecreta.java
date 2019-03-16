package com.xacarana.ahorcado.logica;

/**
 * Created by User on 25/09/2016.
 */
public class PalabraSecreta {

    private String palabra_secreta;
    private String progreso_palabra;
    private static final String SIMBOLO_SECRETO = "*";

    public String codificarPalabra()
    {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < palabra_secreta.length(); i++)
        {
            if(palabra_secreta.charAt(i)!=' ') {
                temp.append(SIMBOLO_SECRETO);
            }
            else {
                temp.append(" ");
            }
        }
        progreso_palabra = temp.toString();
        return  progreso_palabra;
    }

    public boolean adivinarLetra(char letra)
    {
        StringBuilder salida = new StringBuilder();
        boolean exito = false;

        for (int i = 0; i < palabra_secreta.length(); i++)
        {
            if (palabra_secreta.charAt(i) == letra)
            {
                salida.append(letra);
                exito = true;
            }
            else
            {
                if (progreso_palabra.charAt(i) != SIMBOLO_SECRETO.charAt(0))
                {
                    salida.append(progreso_palabra.charAt(i));
                }
                else
                {
                    salida.append(SIMBOLO_SECRETO);
                }
            }
        }
        progreso_palabra = salida.toString();
        return exito;

    }

    public boolean adivinoPalabra()
    {
        return progreso_palabra.equals(palabra_secreta);
    }

    public String getProgresoPalabra() {
        return progreso_palabra;
    }

    public void setPalabra_secreta(String palabra_secreta) {
        this.palabra_secreta = palabra_secreta;
        codificarPalabra();
    }
}

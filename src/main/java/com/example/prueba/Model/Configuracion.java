package com.example.prueba.Model;

public class Configuracion {
    private String ruta;
    private String distintivo;
    private int consecutivo;

    public Configuracion() {
    }

    public Configuracion(String ruta, String distintivo, int consecutivo) {
        this.ruta = ruta;
        this.distintivo = distintivo;
        this.consecutivo = consecutivo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getDistintivo() {
        return distintivo;
    }

    public void setDistintivo(String distintivo) {
        this.distintivo = distintivo;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }
}

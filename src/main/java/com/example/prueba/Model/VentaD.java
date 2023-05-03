package com.example.prueba.Model;

public class VentaD {
    private String id;
    private int renglon;
    private String articulo;
    private int cantidad;
    private double precio;
    private boolean enviado;


    public VentaD(String id, int renglon, String articulo, int cantidad, double precio, boolean enviado) {
        this.id = id;
        this.renglon = renglon;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.enviado = enviado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRenglon() {
        return renglon;
    }

    public void setRenglon(int renglon) {
        this.renglon = renglon;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}


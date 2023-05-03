package com.example.prueba.Model;

import com.google.type.Date;


public class Venta {
    private String id;
    private Date fecha;
    private double importe;
    private String usuario;
    private boolean enviado;

    // Constructor vacío
    public Venta() {}

    // Constructor con todos los campos
    public Venta(String id, Date fecha, double importe, String usuario, boolean enviado) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.usuario = usuario;
        this.enviado = enviado;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }
}


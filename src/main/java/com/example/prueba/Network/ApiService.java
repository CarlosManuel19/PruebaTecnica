package com.example.prueba.Network;

import com.example.prueba.Model.Venta;
import com.example.prueba.Model.VentaD;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("data/get_articulo")
    Call<String> getArticulo(@Query("ruta") String ruta);

    @GET("data/get_ruta")
    Call<List<String>> getRuta();

    @POST("venta/insertar_venta")
    Call<String> insertarVenta(@Body Venta venta);

    @POST("venta/insertar_ventaD")
    Call<String> insertarVentaDetalle(@Body VentaD ventaD);
}


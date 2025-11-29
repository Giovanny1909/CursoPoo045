package com.mx.curso.Unidad3.Herencia.Practica05;

public class RegistroInventario {

    public String nombreEncargado;

    public RegistroInventario(String nombreEncargado){
        this.nombreEncargado=nombreEncargado;
    }

    public void registrarMovimiento(Articulo articulo, int cantidad){
        articulo.setCantidadStock(cantidad);
    }

    public void registrarMovimiento(Articulo articulo, int cantidad, String prioridad){

    }
}

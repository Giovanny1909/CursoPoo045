package com.mx.curso.Unidad3.Herencia.Practica05;

public class Articulo {
    private String codigo;
    private Integer cantidadStock;
    private double precioUnitario;

    //Creando Contructor
    public Articulo (){
        this.cantidadStock=0;
        this.precioUnitario=1;
    }

    /**
     *•	Constructor Completo (Sobrecarga de Constructor):
     *  Crea un segundo constructor público que reciba los tres atributos como
     *  argumentos y los inicialice.
     */
    public Articulo(String codigo, Integer cantidadStock, double precioUnitario){
        this.codigo=codigo;
        this.cantidadStock=cantidadStock;
        this.precioUnitario=precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer nuevaCantidad) {
        this.cantidadStock = nuevaCantidad;
    }
}

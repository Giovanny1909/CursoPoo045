package com.mx.curso.Unidad3.Polimorfismo;

public abstract class Empleado {

    public void trabajar(){
        System.out.println("El empleado esta trabajando");
    }
    public abstract double calcularSalario();
}

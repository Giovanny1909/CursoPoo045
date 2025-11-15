package com.mx.curso.Unidad2.Ejercicio1511;

public class Main {
    static void main(String[] args) {
        Television tv = new Television();
        tv.setTamaño(15);
        tv.setMarca("Samsumg");

        System.out.println("El tamaño de la tv es: " + tv.getTamaño());
        System.out.println("La marca de la tv es: " + tv.getMarca());

    }
}

package com.mx.curso.unidad1.Herencia;

public class Main {
    static void main(String[] args) {
        Persona humano = new Persona();
        humano.setNombre("Giovanny");
        System.out.println("Nombre:" + humano.getNombre());

        Car carro = new Car();
        carro.setNumberTire(4);
        carro.setTypeLihgt("Led");

        System.out.println(carro.getNumberTire());
        System.out.println(carro.getTypeLihgt());
    }
    }


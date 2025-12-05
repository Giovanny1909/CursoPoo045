package com.mx.curso.Unidad3.ParadigmaOO;

interface InterfazEncendible {
    void encender();
    void apagar();
}
//clase Tv que implementa la interfaz Encendible
class Tv implements InterfazEncendible {
    @Override
    public void encender() {
        System.out.println("La TV está encendida.");
    }
    @Override
    public void apagar() {
        System.out.println("La TV está apagada.");
    }
}
//clase Bombilla que implementa la interfaz Encendible
class Bombilla implements InterfazEncendible {
    @Override
    public void encender() {
        System.out.println("La bombilla está encendida.");
    }
    @Override
    public void apagar() {
        System.out.println("La bombilla está apagada.");
    }
}
//clase principal para probar la interfaz y el polimorfismo
public class Encendible {
    public static void main (String[] args) {
        //con esto creamos un polimorfismo
        InterfazEncendible misAparatos[] = new InterfazEncendible[2];
        misAparatos[0] = new Tv();
        misAparatos[1] = new Bombilla();
        for (InterfazEncendible aparato : misAparatos) {
            aparato.encender();
            aparato.apagar();
            System.out.println("-----");
        }
    }
}

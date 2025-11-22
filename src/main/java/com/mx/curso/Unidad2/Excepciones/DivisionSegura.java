package com.mx.curso.Unidad2.Excepciones;

public class DivisionSegura {
    static void main(String[] args) {
        int numero1=0;
        int numero2=7;
        int resultado=0;
        try {
            resultado= numero2/numero1;
            System.out.println("El resultado de la división es: "+ resultado);
        } catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir entre cero");
        }
    }
}

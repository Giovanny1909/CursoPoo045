package com.mx.curso.Unidad2.Excepciones;

import java.util.Scanner;

public class ValidadorEdad {
    static void main(String[] args) {
       int edad=0;

        Scanner scanner =new Scanner(System.in);

        try {
            System.out.println("Ingresa tu edad: ");
            edad=Integer.parseInt(scanner.nextLine());
            validadEdad(edad);
            System.out.println("Tu edad es: "+ edad);

        }catch (IllegalArgumentException e){
            System.out.println("La edad no es valida: "+
                    e.getMessage());

        }
    }
    static void validadEdad(int edad) throws IllegalArgumentException{
        if (edad<0 || edad>120){
            throw new IllegalArgumentException("Edad No valida: "+ edad);
        }
    }
}

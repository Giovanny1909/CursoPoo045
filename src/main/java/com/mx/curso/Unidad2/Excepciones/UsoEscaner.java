package com.mx.curso.Unidad2.Excepciones;

import java.util.Scanner;

public class UsoEscaner {
    static void main(String[] args) {
        int edad;
        Scanner scanner=new Scanner(System.in);
        scanner.close();

        try {
            System.out.print("Introduce tu edad: ");
            edad = scanner.nextInt();

        }catch (IllegalStateException e){
            System.out.println("No es posible leer" +  "porque el Scanner ya esta cerrado"
            + e.getMessage());
        }
    }
}

package com.mx.curso.Unidad2.Excepciones;

import java.util.Scanner;

public class ConversorNumerico {
    static void main(String[] args) {
        String text = "";
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingresa un texto: ");
            text=scanner.nextLine();
            int numero= Integer.parseInt(text);
            System.out.println("Numero: "+ numero);

        }catch (NumberFormatException e){
            System.out.println("El formato no corresponde a un numero " +
                    "entero valido");

        }
    }
}

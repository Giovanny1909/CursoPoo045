package com.mx.curso.Unidad2.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {
    static void main(String[] args) {
        int anioActual=2025;

        Scanner scanner = new Scanner(System.in);



        try {
            int anioNacimiento = scanner.nextInt();
            int edad = anioActual - anioNacimiento;
        } catch(InputMismatchException e){
            System.out.println("Error: Debes ingresar " + "un numero valido para el anio de nacimiento");

        }
        scanner.close();
    }
}

package com.mx.curso.Unidad2.Excepciones;

import java.util.Scanner;

public class AccesoLista {
    static void main(String[] args) {
        int[] arr= {1,2,4};
        int posicion=0;
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Ingresa una posicion: ");
            posicion= scanner.nextInt();
            System.out.println(arr[posicion]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("La posición no existe en la lista");
        }finally {
            scanner.close();
        }
    }
}

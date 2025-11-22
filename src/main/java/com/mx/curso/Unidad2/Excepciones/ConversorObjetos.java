package com.mx.curso.Unidad2.Excepciones;

public class ConversorObjetos {
    static void main(String[] args) {
        Object nombre = "luis";

        try {
            Integer numero= (Integer) nombre;

        }catch (ClassCastException e){
            System.out.println("No es posible convertir un tipo "+
                    "de objeto al tipo deseado "+ e.getMessage());

        }
    }
}

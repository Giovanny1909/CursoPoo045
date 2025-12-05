package com.mx.curso.Unidad2.Ciclos;

public class ProcesadorDeListas {
    static void main(String[] args) {
        String [] frutas= {"Manzana", "Platano", "Mango", "Guayaba", "Pera"};

        for (int i=0; i< frutas.length; i++){
            System.out.println("Nombre de la fruta: "+ frutas[i]);
        }

        //Buscar un elemento especifico, utilizando while

        int indice=0;
        while (indice< frutas.length){
            if(frutas[indice].equals("Mango")){
                System.out.println("Fruta encontrada: "+ frutas[indice]);
                break;
            }
            indice++;
        }
    }

    public static class RecetaDeCocina {
        static void main(String[] args) {
            int ingredientesPreparados=0;
            int tipoDeCocina =0;

            System.out.println("Paso 1: Preparar los ingredientes");
            System.out.println(ingredientesPreparados++);
            System.out.println("Agregar ingrediente al platillo");
            System.out.println(ingredientesPreparados++);

            System.out.println("Paso 2: Cocina Platillo");
            System.out.println(tipoDeCocina++);

            System.out.println("Paso 3: Servir el platillo");

        }

    }
}

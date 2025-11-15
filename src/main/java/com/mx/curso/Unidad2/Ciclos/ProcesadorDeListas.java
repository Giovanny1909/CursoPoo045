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
}

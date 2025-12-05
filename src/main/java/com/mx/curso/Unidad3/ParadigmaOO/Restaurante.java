package com.mx.curso.Unidad3.ParadigmaOO;

public class Restaurante {
    String nombre = "La Bamba";
    String tipoDeComida;
    int calificacion;

    public void abrir() {
        System.out.println("El restaurante " + nombre + " está abierto. " + calificacion + " estrellas.");

    }

// clase principal Main

    public static void main(String[] args) {
        /* Crear una instancia de Restaurante 1 */
        Restaurante restaurante1 = new Restaurante();
        restaurante1.nombre = "La Bamba";
        restaurante1.tipoDeComida = "Mariscos";
        restaurante1.calificacion = 3;

        Restaurante restaurante2 = new Restaurante();
        restaurante2.nombre = "Pambatacos";
        restaurante2.tipoDeComida = "Antojitos";
        restaurante2.calificacion = 4;
        // Abrir los restaurantes para ver el mensaje
        restaurante1.abrir();
        restaurante2.abrir();
    }
}

package com.mx.curso.Unidad3.Practica1;
import java.util.Scanner;

public class NotificacionesAutomaticas {
    public static boolean validarEmail(String email) {
        return email.contains("@"); // Lógica simple
    }

    public static void NotificacionesAutomaticas() {
        Scanner scanner = new Scanner(System.in);

        String email;
        boolean esValido;
        //ciclo do while
        do {
            System.out.print("Ingrese su correo electrónico para notificar: ");
            email = scanner.nextLine().trim();
            esValido = validarEmail(email);
            if (!esValido) {
                System.out.println("Error: El correo electrónico debe contener el símbolo '@'. Intente de nuevo.");
            }
        } while (!esValido);// esto es es para que repita mientras NO se valido

        System.out.println("Correo electrónico válido: " + email);
    }

    public static void main(String[] args) {
        NotificacionesAutomaticas();
    }
}

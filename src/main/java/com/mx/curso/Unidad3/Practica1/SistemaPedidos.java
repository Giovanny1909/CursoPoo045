package com.mx.curso.Unidad3.Practica1;
import java.util.Scanner;

public class SistemaPedidos {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Entregado")) {
            System.out.print("Ingrese el estado del envío (En preparación, En camino, Entregado): ");
            estado = scanner.nextLine().trim();

            if (estado.equalsIgnoreCase("En camino")) {
                System.out.println("--- El pedido sigue en transito ---");
                continue; //continua al siguiente ciclo
            }
            if (estado.equalsIgnoreCase("Error")) {
                System.out.println("--- Alerta se detuvo el proceso por error en el envio---");
                break; //termina el ciclo

            }
            System.out.println("Estado registrado: " + estado);
        }
        if (estado.equalsIgnoreCase("Entregado")) {
            System.out.println("El pedido ha sido entregado con éxito.");
        }
    }
}

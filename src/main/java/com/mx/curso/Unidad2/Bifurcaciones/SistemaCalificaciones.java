package com.mx.curso.Unidad2.Bifurcaciones;

public class SistemaCalificaciones {
    static void main(String[] args) {
        int notaExamen = 85;

        if (notaExamen >= 60) {
            System.out.println("Felicidades Aprobaste el curso");
        }
        if (notaExamen >= 90) {
            System.out.println("Excelente desempeño");
        }

        else
        {
            System.out.println("Lo Sentimos, no has aprobado");
        }
    }
}

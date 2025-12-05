package com.mx.curso.Unidad3.Practica1;

public class ReporteInventario {
    public static void main(String[] args) {
        int [] inventario = {50, 20, 15, 30, 0, 90, 5, 75, 60, 40};
        //ciclo for
        for (int i = 0; i < inventario.length; i++) {
            int cantidad = inventario[i];
            String estado = " ";
            int caso;
            if (cantidad > 50) caso = 1;
            else if (cantidad >= 10 && cantidad <=50) caso = 2;
            else if (cantidad >= 1 && cantidad <=9) caso = 3;
            else caso = 0;

            //usamos switch para asignar los casos
            switch (caso) {
                case 1:
                    estado = "En Stock";
                    break;
                case 2:
                    estado = "Bajo Stock";
                    break;
                case 3:
                    estado = "Urgente";
                    break;
                case 0:
                    estado = "Descontinuado";
                    break;
            }
            System.out.println("Producto " + (i + 1) + ": " + cantidad + " unidades - " + estado);
        }
    }

}

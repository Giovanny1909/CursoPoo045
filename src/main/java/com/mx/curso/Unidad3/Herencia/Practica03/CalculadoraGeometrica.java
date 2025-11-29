package com.mx.curso.Unidad3.Herencia.Practica03;

public class CalculadoraGeometrica {

    private String nombreFigura;
    public static double PI=3.14159;

    //Aqui se inicia el constructor sin argumentos
    public CalculadoraGeometrica(){
        this.nombreFigura="Desconocida";
    }

    //Esto es un constructor con argumentos
    public CalculadoraGeometrica(String nombreFigura){
        this.nombreFigura=nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public double calcularArea (double radio){
        return PI * radio*radio;
    }

    public double calcularArea (double ancho, double alto){
        return ancho*alto;
    }

    public double calcularArea (double base, int altura){
        return (base*altura)/2;
    }

    static void main(String[] args) {
        CalculadoraGeometrica cal1
                =new CalculadoraGeometrica("principal");
        System.out.println("Area del circulo: "+ cal1.calcularArea(5));
        System.out.println("Area del Rectangulo: "+ cal1.calcularArea(4,6));
        System.out.println("Area del Triangulo: "+ cal1.calcularArea(15,30));
        System.out.println("****************************");

    }


}

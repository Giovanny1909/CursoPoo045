package com.mx.curso.Unidad3.ConceptosPoo;

public class Revista extends Material {
    private int edicion;

    public Revista(String titulo, String autor, int añoPublicacion, int edicion) {
        super(titulo, autor, añoPublicacion);
        this.edicion = edicion;
    }

    public int getEdicion() { return edicion; }
    public void setEdicion(int edicion) { this.edicion = edicion; }

    @Override
    public void mostrarInfo() {
        System.out.println("Revista: " + getTitulo() + " | Autor: " + getAutor() +
                " | Año: " + getAñoPublicacion() +
                " | Edición: " + edicion);
    }
}

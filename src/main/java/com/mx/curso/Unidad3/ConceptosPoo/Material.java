package com.mx.curso.Unidad3.ConceptosPoo;

public class Material {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAñoPublicacion() { return añoPublicacion; }
    public void setAñoPublicacion(int añoPublicacion) { this.añoPublicacion = añoPublicacion; }

    // Polimorfismo: se sobreescribe en las clases hijas
    public void mostrarInfo() {
        System.out.println("Material genérico");
    }
}
package com.mx.curso.Unidad3.ConceptosPoo;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "George Orwell", 1949, 328);
        Revista revista1 = new Revista("National Geographic", "Varios", 2022, 104);

        Usuario usuario = new Usuario("Carlos", 1001);

        usuario.pedirMaterial(libro1);
        usuario.pedirMaterial(revista1);
    }
}

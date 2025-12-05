package com.mx.curso.Unidad3.ConceptosPoo;

public class Usuario {
    private String nombre;
    private int idUsuario;

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public void pedirMaterial(Material m) {
        System.out.println(nombre + " está consultando el material:");
        m.mostrarInfo(); // Polimorfismo
    }
}


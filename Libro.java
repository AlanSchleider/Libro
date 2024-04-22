package com.mycompany.libropoo;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anoPublicacion;
    private boolean leido;

    /**
     * tipo constatnte 0(1)
     * **/

    public Libro(String titulo, String autor, String genero, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.leido = false;
    }
    /**
     * tipo constatnte 0(1)
     * **/

    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion + ", Género: " + genero;
    }
    /**
     * tipo constatnte 0(1)
     * **/

    public void marcarLeido() {
        this.leido = true;
    }
    /**
     * tipo constatnte 0(1)
     * **/

    public boolean esAntiguo() {
        int year = java.time.Year.now().getValue();
        return (year - anoPublicacion) > 50;
    }/**
     * tipo constatnte 0(1)
     * **/


    public boolean estaLeido() {
        return leido;
    }
}

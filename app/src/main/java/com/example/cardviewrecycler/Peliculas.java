package com.example.cardviewrecycler;


public class Peliculas {

    private String titulo;
    private String distribuidor;
    private int foto;


    public Peliculas() {
    }

    public Peliculas(String titulo, String distribuidor, int foto) {
        this.titulo =titulo ;
        this.distribuidor = distribuidor;
        this.foto = foto;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDistribuidor() {
        return this.distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getFoto() {
        return this.foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
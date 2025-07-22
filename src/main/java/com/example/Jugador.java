package com.example;

public class Jugador {
    String nombre;
    int edad;
    String posicion;

    public Jugador(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y juego como " + posicion + ".");
    }

    public void cambiarPosicion(String nuevaPosicion) {
        this.posicion = nuevaPosicion;
        System.out.println(nombre + " ahora juega como " + nuevaPosicion);
    }
}
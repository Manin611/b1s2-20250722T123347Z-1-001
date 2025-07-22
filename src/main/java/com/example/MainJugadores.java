package com.example;

public class MainJugadores {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("James Rodríguez", 32, "Volante");
        Jugador jugador2 = new Jugador("Luis Díaz", 27, "Delantero");
        Jugador jugador3 = new Jugador("David Ospina", 36, "Arquero");

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        jugador2.cambiarPosicion("Extremo izquierdo");
    }
}

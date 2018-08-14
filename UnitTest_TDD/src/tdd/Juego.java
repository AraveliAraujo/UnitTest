package tdd;

public class Juego {

    private int numeroJugadores = 2;
    private int puntajeJugador1 = 0;
    private int puntajeJugador2 = 0;

    public Juego() {
        this.numeroJugadores = 2;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public int getPuntajeJugador1() {
        return puntajeJugador1;
    }

    public int getPuntajeJugador2() {
        return puntajeJugador2;
    }
}

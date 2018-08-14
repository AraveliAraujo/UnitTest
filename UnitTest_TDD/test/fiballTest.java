
import org.junit.Test;
import static org.junit.Assert.*;
import tdd.Juego;

public class fiballTest {

    /*Dado que el juego inica
    Cuando inicia
    Hay 2 jugadores*/
    @Test
    public void test2Jugadores() {
        Juego juego = new Juego();
        assertEquals(2, juego.getNumeroJugadores());
    }

    /*Cuando el juego inicia
    Cada jugador tiene 0 puntos
     */
    public void testPuntajeInicialJugador1() {
        //Cuando el juego inicia
        Juego juego = new Juego();
        //El jugador 1 jugador tienen 0 puntos
        assertEquals(0, juego.getPuntajeJugador1());
        
    }
    
    public void testPuntajeInicialJugador2() {
        //Cuando el juego inicia
        Juego juego = new Juego();
        //El jugador 2 jugador tienen 0 puntos
        assertEquals(0, juego.getPuntajeJugador2());
        
    }
    
    
    
}

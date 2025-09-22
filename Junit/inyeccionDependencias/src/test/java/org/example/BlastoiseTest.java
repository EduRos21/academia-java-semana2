package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlastoiseTest {
    Pokemon blastoise;
    @BeforeEach
    void setupBeforeEach() {
        blastoise = new Blastoise();
    }

    @Test
    @DisplayName("Prueba del metodo atacar() de Blastoise")
    void pruebaMetodoAtacar(){
        String resultado = blastoise.atacar();
        assertEquals("ataco", resultado, "El método atacar() debe devolver 'ataco'");
    }


    @Test
    @DisplayName("Prueba de que Blastoise sea una instancia de la interfaz Pokemon")
    void pruebaInstanciaPokemon() {
        assertTrue(blastoise instanceof Pokemon, "Blastoise tiene que implementar Pokemon");
    }

    @Test
    @DisplayName("La instancia de Blastoise no tiene que ser null")
    void isBlastoise() {
        assertNotNull(blastoise, "blastoise no tiene que ser null");
    }
}

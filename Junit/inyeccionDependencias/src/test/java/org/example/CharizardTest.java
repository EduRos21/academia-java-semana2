package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharizardTest {
    Pokemon charizard;

    @BeforeEach
    void setupBeforeEach() {
        charizard = new Charizard();
    }

    @Test
    @DisplayName("Prueba del metodo atacar() de Charizard")
    void pruebaMetodoAtacar() {
        String res = charizard.atacar();
        assertEquals("ataco", res, "El metodo ataco() debe retornar 'ataco'");
    }

    @Test
    @DisplayName("Prueba de que Charizard sea una instancia de la interfaz Pokemon")
    void pruebaInstanciaPokemon() {
        assertTrue(charizard instanceof Pokemon, "Charizard tiene que implementar Pokemon");
    }

    @Test
    @DisplayName("La instancia de Charizard no tiene que ser null")
    void isCharizard() {
        assertNotNull(charizard, "charizard no tiene que ser null");
    }
}

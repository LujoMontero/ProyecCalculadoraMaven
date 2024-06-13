package org.example.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp(){
        calculadora = new Calculadora();
    }

  @Test
  @DisplayName("realizando suma")
    void testSuma(){
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado,"2 + 3 deberia ser 5");
    }

    @Test
    @DisplayName("Prueba de resta")
    void testresta(){
        int resultado = calculadora.resta(2, 3);
        assertEquals(-1, resultado,"2 - 3 deberia ser -1");
    }
    @Test
    @DisplayName("prueba de multiplicacion")
    void testmultiplicacion(){
        int resultado = calculadora.multiplicacion(6, 3);
        assertEquals(18, resultado,"6 * 3 deberia ser 18");
    }
@Test
    @DisplayName("prueba de divicion")
    void testdivicion(){
        float resultado = calculadora.division(3, 2);
        assertEquals(1.5, resultado,"6 / 3 deberia ser 2");
}



}

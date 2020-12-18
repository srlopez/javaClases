package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import entornos.matematicas.Calculadora;

class CalculadoraTests {

    @Test
    @DisplayName("Validamos que la memoria se establece correctamente")
    void setMemoriaTest() {
        //Preparación
        Calculadora cal = new Calculadora();
        //Ejecución
        cal.setMemoria(24.5);
        //Aserción
        assertEquals(24.5, cal.getMemoria());
    }
   
}
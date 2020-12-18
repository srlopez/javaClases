package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import entornos.matematicas.Calculadora;

class CalculadoraTests {

    @Test
    @DisplayName("Validamos que la memoria se establece correctamente")
    void setMemoriaTest() {
        // Preparación
        Calculadora cal = new Calculadora();
        // Ejecución
        cal.setMemoria(24.5);
        // Aserción
        assertEquals(24.5, cal.getMemoria());
    }

    @Test
    @DisplayName("Prueba de resta de 5 de una memporia de 30")
    void resta5DeMemoria30() {
        fail("Not yet implemented");
        // Preparación//Arrange//Given

        // Ejecución//Act//When

        // Aserción//Assert//Then

    }

    // Hacer Test para

    // A
    // Una funciónn que verifica el m.c.d de dos numeros
    // - Si es distinto
    // - Si es 1, y si es algunos de los dos, Si el mayor el es el param #1, etc

    // B Ejercicios del PDF
    // Una función que nos devuelva el menor de TRES números

    // C TEstear la suma de dos Fracciones
}
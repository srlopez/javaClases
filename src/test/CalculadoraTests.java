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



        @Test
        @DisplayName("Prueba de resta de 5 de una memporia de 30")
        void resta5DeMemoria30(){
            //Preparación//Arrange//Given
            
            //Ejecución//Act//When
           
            //Aserción//Assert//Then
           
        }
    }
   
    // Hacer Test para

    
    // Una funciónn que verifica el m.c.d  de dos numeros
    // Si es distinto
    // Si es 1, y si es algunos de los dos, Si el mayor el es el param #1

    // Una función que nos devuelva el menor de TRES números

 }
 // Otra clase de Test
 // Una función (en CadenaTexto) que crea un string de '=-' y 'o', en la que se pasan 4 parametros.
 //    Longitud final del string,  posición de inicio, y fin de 'o', y separación entre ellos,
 // ejemplos
 //   20,5,15,3  =====o--o--o--o-=====
 //   20,9,15,1  ========ooooooo=====

package entornos.consola;

//import java.util.Scanner;

import entornos.matematicas.*;
import entornos.textos.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hola Mundo!");
        System.out.println("método main corriendo ...");


		// Scanner teclado = new Scanner(System.in);
		// System.out.println("Dame un número");
		// double j = teclado.nextDouble();

        // DEfinicion de una variable de tipo String
        String persona;
        persona = "Santi";

        // invocacion a funciones
        saludos(persona);
        saludos(persona + " y el resto de la familia");
        saludos(persona + " y compañia");
        saludos(persona + " a las chicas");

        // Instanciación de Objetos y utilización de los mismos
        Calculadora cal = new Calculadora();
        cal.setMemoria(25);
        double mem = cal.getMemoria();
        System.out.println("En menpria hay un " + mem);

        // Instanciamos 'otro' objeto de la misma Clase Claculadora
        Calculadora cal2 = new Calculadora();
        mem = cal2.suma(4, 3);
        System.out.println(mem);
        // Invocamos operaciones=metodos de la calculadora
        mem = cal.resta(4, 3);
        System.out.println(mem);
        mem = cal.divide(10, 2);
        System.out.println(mem);
        mem = cal2.suma(4);
        System.out.println(mem);

        // El ejercicio de texots
        CadenaTexto ct = new CadenaTexto();
        ct.texto1 = "uno";
        ct.texto2 = "dos";
        System.out.println("la union es = '" + ct.union() + "'");
        ct.mostrar();
        // Confirmacion de los valores staticos
        CadenaTexto ct2 = new CadenaTexto();
        System.out.println("la union es = '" + ct.union() + "'");
        ct2.texto2 = "tres";
        ct.mostrar();

        // mcd
        saludos("al Mcd de 34 y 16"+Utilidades.mcd(34,16));



        // Fraccion
        Fraccion f1 = new Fraccion(3, 4);
        saludos(f1.toString());
        Fraccion f2 = new Fraccion(5);
        saludos(f2.toString());
        Fraccion f3 = new Fraccion(1, 8);
        saludos(f3.toString());
        Fraccion f4 = new Fraccion(3,5);
        Fraccion f5 = new Fraccion(2,4);
        saludos("f4+f5="+cal2.suma(f4, f5));

        // MCD
        System.out.println("mcd de 8 y 6 = " + Utilidades.mcd(8, 6));
        System.out.println("mcd de 13 y 15 = " + Utilidades.mcd(13, 15));
        System.out.println("mcd de 21 y 9 = " + Utilidades.mcd(21, 9));
        System.out.println("mcd de 14 y 16 = " + Utilidades.mcd(14, 16));
        System.out.println("mcd de 12 y 6 = " + Utilidades.mcd(12, 6));

        // MCM
        // System.out.println("mcm de 8 y 6 = " + cal.mcm(8, 6));
        // System.out.println("mcm de 13 y 15 = " + cal.mcm(13, 15));
        // System.out.println("mcm de 21 y 9 = " + cal.mcm(21, 9));
        // System.out.println("mcm de 14 y 16 = " + cal.mcm(14, 16));
        // System.out.println("mcm de 12 y 6 = " + cal.mcm(12, 6));

        System.out.println("Suma " + f1 + " + " + f3 + " = " + cal.suma(f1, f3));
        f1 = new Fraccion(2, 5);
        f3 = new Fraccion(6, 10);
        System.out.println("Suma " + f1 + " + " + f3 + " = " + cal.suma(f1, f3));

    }

    // Defunición de un metodo void == procedimiento
    public static void saludos(String persona) {
        System.out.println("Hola, que tal " + persona + "...");
    }
}

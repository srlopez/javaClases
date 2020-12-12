package entornos.matematicas;

public class Fraccion {
    private int numerador;
    private int denominador;

    public int n(){ return numerador;}
    public int d(){ return denominador;}

    public Fraccion(int n, int d) {
        numerador = n;
        denominador = d;
    }    
    
    public Fraccion(int n) {
        numerador = n;
        denominador = 1;
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}

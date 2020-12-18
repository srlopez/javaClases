package entornos.matematicas;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int n, int d) {
        numerador = n;
        denominador = d;
    }    
    
    public Fraccion(int n) {
        numerador = n;
        denominador = 1;
    }

    public Fraccion mas(Fraccion f){
        int n = numerador * f.denominador + f.numerador * denominador;
        int d = denominador*f.denominador;
        int mcd = Utilidades.mcd(n, d);
        //System.out.println(n + " " + d + " " + mcd);
        return new Fraccion(n / mcd, d / mcd);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}

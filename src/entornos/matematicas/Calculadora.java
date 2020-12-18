package entornos.matematicas;

public class Calculadora {

    // MEMORIA
    double memoria = 0;

    public void setMemoria(double value) {
        memoria = value;
    }

    public double getMemoria() {
        return memoria;
    }

    // SUMA
    public double suma(double x) {
        memoria += x;
        return memoria;
    }

    public double suma(double x, double y) {
        memoria = x + y;
        return memoria;
    }

    public Fraccion suma(Fraccion x, Fraccion y) {
        return x.mas(y);
    }

    // RESTA
    public double resta(int i) {
        memoria -= i;
        return memoria;
    }

    public double resta(double x, double y) {
        memoria = x - y;
        return memoria;
    }

    // MULTIPLICA
    public double multiplica(double m) {
        memoria *= m;
        return memoria;
    }

    public double multiplica(double x, double y) {
        memoria = x * y;
        return memoria;
    }

    // DIVISION
    public double divide(double m) {
        memoria /= m;
        return memoria;
    }

    public double divide(double x, double y) {
        memoria = x / y;
        return memoria;
    }

}
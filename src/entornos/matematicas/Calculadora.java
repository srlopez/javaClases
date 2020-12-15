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
    public double multica(double m) {
        memoria *= m;
        return memoria;
    }

    public double multica(double x, double y) {
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

    // OTRA OPERACIONES
    public static int mcd(int x, int y) {
        // maximo comun divisor

        while (x != y)
            if (x > y)
                x = x - y;
            else
                y = y - x;

        return x;
    }

    public int mcm(int x, int y) {
        // minimo comun multiplo
        int mcm = 1;
        int i = 2;
        while (i <= x || i <= y) {
            if (x % i == 0 || y % i == 0) {
                mcm = mcm * i;
                if (x % i == 0)
                    x = x / i;
                if (y % i == 0)
                    y = y / i;
            } else
                i = i + 1;
        }
        return mcm;
    }

}
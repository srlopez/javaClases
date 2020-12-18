package entornos.matematicas;

public class Utilidades {

    
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

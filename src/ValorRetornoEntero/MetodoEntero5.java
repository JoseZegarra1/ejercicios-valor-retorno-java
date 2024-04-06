package ValorRetornoEntero;

public class MetodoEntero5 {
    // Método que calcula el factorial de un número entero y devuelve el resultado
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


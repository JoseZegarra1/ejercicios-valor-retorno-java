package ValorRetornoEntero;

public class MetodoEntero4 {
    // Método que divide dos números enteros y devuelve el resultado
    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }
}


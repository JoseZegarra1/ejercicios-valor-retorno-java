package ValorRetornoBoolean;

public class MetodoBooleano4 {
    // Método que verifica si un año es bisiesto
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}

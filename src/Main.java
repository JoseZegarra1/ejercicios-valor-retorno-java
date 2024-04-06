import ValorRetornoEntero.*;
import ValorRetornoBoolean.*;
import ValorRetornoCadena.*;
public class Main {
    public static void main(String[] args) {
        // Invocar y mostrar resultados de los métodos
        System.out.println("Suma: " + MetodoEntero1.sumar(5, 3));
        System.out.println("Resta: " + MetodoEntero2.restar(10, 4));
        System.out.println("Multiplicación: " + MetodoEntero3.multiplicar(6, 7));
        System.out.println("División: " + MetodoEntero4.dividir(15, 3));
        System.out.println("Factorial: " + MetodoEntero5.factorial(5));

        //INvocar y mostrar resultado de metodos booleanos con retorno
        System.out.println("¿Es par?: " + MetodoBooleano1.esPar(6));
        System.out.println("¿Es positivo?: " + MetodoBooleano2.esPositivo(-3));
        System.out.println("¿Es primo?: " + MetodoBooleano3.esPrimo(17));
        System.out.println("¿Es bisiesto?: " + MetodoBooleano4.esBisiesto(2024));
        System.out.println("¿Es cadena vacía?: " + MetodoBooleano5.esCadenaVacia("Hola"));

        // Invocar y mostrar resultados de los métodos de cadena

        System.out.println("Concatenación: " + MetodoCadena1.concatenar("Hola ", "mundo"));
        System.out.println("Entero a cadena: " + MetodoCadena2.enteroACadena(42));
        System.out.println("Mayúsculas: " + MetodoCadena3.aMayusculas("openai"));
        System.out.println("Reemplazar: " + MetodoCadena4.reemplazar("Hola mundo", "mundo", "amigos"));
        System.out.println("Subcadena: " + MetodoCadena5.obtenerSubcadena("Java es genial", 5, 7));

    }
}

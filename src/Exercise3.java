/*Ejercicio 3 - Cálculo de Factorial
Definir el Problema:
El factorial de un número entero positivo n (denotado como n!) es el producto de todos los enteros positivos desde 1 hasta n.
Por ejemplo:

3! = 3 * 2 * 1 = 6
5! = 5 * 4 * 3 * 2 * 1 = 120
Estructura del Programa:
Crear un método separado que realice el cálculo del factorial.

Interacción con el Usuario:
Pedir al usuario que ingrese un número entero positivo.

Mostrar Resultados:
Después de calcular el factorial, mostrar el resultado al usuario en la consola.*/


import java.math.BigInteger;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un número para conocer su Factorial");
        int factorial = reader.nextInt();

        System.out.printf( "El factorial de %d es %d ",factorial, getFactorial(factorial) );
    }
    //Metodo que calcula factorial usando la clase BigInteger.

    public static BigInteger getFactorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

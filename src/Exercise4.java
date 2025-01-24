/*
*Ejercicio 4 - Números Primos
Definir el Problema:
Un número primo es un número entero mayor que 1 que solo es divisible por 1 y por sí mismo.
Ejemplos de números primos: 2, 3, 5, 7, 11, 13, etc.

Estructura del Programa:
Crear un método separado que realice la verificación de si un número es primo.

Interacción con el Usuario:
Pedir al usuario que ingrese un número entero positivo.

Mostrar Resultados:
Después de verificar si el número es primo, mostrar el resultado al usuario en la consola.
Por ejemplo:

Ingresa un número: 29

El número 29 es primo.
Ingresa un número: 30

El número 30 no es primo.

* */


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un numero para comprobar si es primo");
        int numeroPrimo = reader.nextInt();

        if ((isPrimo(numeroPrimo))){
            System.out.println(" ==========================");
            System.out.printf( " | El %d es numero primo  |\n ",numeroPrimo);
            System.out.println("===========================");

        }else {

            System.out.println(" ================================");
            System.out.printf( " | El %d  no es numero primo     |\n ",numeroPrimo);
            System.out.println("=================================");
        }



    }

    static boolean isPrimo(int number) {
        if (number <= 1) {
            return false; // Números menores o iguales a 1 no son primos
        }
        if (number == 2) {
            return true; // 2 es primo
        }
        if (number % 2 == 0) {
            return false; // Números pares mayores que 2 no son primos
        }
        // Verificar divisores desde 3 hasta la raíz cuadrada del número
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; // Si encontramos un divisor, no es primo
            }
        }
        return true; // Si no se encontraron divisores, es primo
    }



}

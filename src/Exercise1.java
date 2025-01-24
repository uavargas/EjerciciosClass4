/*
* Ejercicio 1 - Conversión de Temperaturas
Definir el Problema:
Necesitamos convertir temperaturas de Celsius a Fahrenheit y viceversa.
Operaciones para las conversiones:

Celsius a Fahrenheit: La fórmula es F = (C * (9 / 5)) + 32.
Fahrenheit a Celsius: La fórmula es C = (F - 32) / (9 / 5).

Estructura del Programa:
Crear métodos separados para cada conversión.

Interacción con el Usuario:
Pedir al usuario que ingrese la temperatura y el tipo de conversión que desea realizar.

Mostrar Resultados:
Mostrar el resultado de la conversión.
Por ejemplo:

temperatura en Celsius: 25

La temperatura en Fahrenheit es: 77.0
Ingresa la temperatura en Fahrenheit: 77

La temperatura en Celsius es: 25.0
* */


import java.util.Scanner;

public class Exercise1 {

    // Método para convertir Celsius a Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * (9.0 / 5)) + 32;
    }

    // Método para convertir Fahrenheit a Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / (9.0 / 5);
    }

    private static final String OPTIONMENU = """
                ╔══════════════════════════════════════╗
                ║        CONVERSOR DE TEMPERATURAS     ║
                ╠══════════════════════════════════════╣
                ║ Seleccione una opción:               ║
                ║  1. Convertir de Celsius a Fahrenheit║
                ║  2. Convertir de Fahrenheit a Celsius║
                ║  3. Salir                            ║
                ╚══════════════════════════════════════╝
                """;


    // se crea de manera estatica para que pueda se accedido desde todo el programa
    private static final Scanner reader = new Scanner(System.in);

    // Método para mostrar Menú
    public static void showMenu() {
        System.out.print(OPTIONMENU);
        System.out.print("Elija una opción para continuar: ");
    }

    // Método para preguntar si desea continuar
    public static boolean continueOp() {
        while (true) {
            System.out.print("¿Desea continuar con otra operación? (S/N): ");
            String input = reader.next().toUpperCase();
            if (input.equals("S")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                System.out.println("Opción no válida. Por favor, ingrese 'S' para sí o 'N' para no.");
            }
        }
    }

    // Método para procesar operación seleccionada
    public static void operador() {
        showMenu();
        String option = reader.next();

        switch (option) {
            case "1":
                System.out.println("Ingrese el valor en Celsius para convertir a grados Fahrenheit: ");
                double celsius = reader.nextDouble();
                double gradosFahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("La temperatura en grados Fahrenheit es %.2f \u00B0F\n", gradosFahrenheit);
                break;
            case "2":
                System.out.println("Ingrese el valor en Fahrenheit para convertir a grados Celsius: ");
                double fahrenheit = reader.nextDouble();
                double gradosCelsius = fahrenheitToCelsius(fahrenheit);
                System.out.printf("La temperatura en grados Celsius es %.2f \u00B0C\n", gradosCelsius);
                break;
            case "3":
                System.out.println("Gracias por usar el conversor de temperaturas. ¡Hasta luego!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    public static void main(String[] args) {
        do {
            operador();
        } while (continueOp());

        System.out.println("Gracias por usar el conversor de temperaturas... ¡Hasta luego!");
        reader.close();
    }
}


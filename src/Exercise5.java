/*Ejercicio 8 - Cálculo de Áreas
Definir el Problema:
Necesitamos calcular el área de un círculo, un cuadrado y un triángulo utilizando las fórmulas matemáticas correspondientes.
Fórmulas de Cálculo:

Área de un Círculo: La fórmula es A = pi * r ^ 2, donde r es el radio del círculo.
Área de un Cuadrado: La fórmula es A = l ^ 2, donde l es la longitud del lado del cuadrado.
Área de un Triángulo: La fórmula es A = (b * h) / 2, donde b es la base y h es la altura del triángulo.
Estructura del Programa:
Crear métodos separados para calcular el área de cada figura geométrica.
Puede utilizar la función creada en el ejercicio 7 para calcular los cuadrados en las formulas.

Interacción con el Usuario:
Pedir al usuario que ingrese los valores necesarios (radio, lado, base y altura) para calcular el área de cada figura.

Mostrar Resultados:
Después de calcular el área, mostrar el resultado al usuario en la consola.*/


import java.util.Scanner;

public class Exercise5 {

    private static final Scanner reader = new Scanner(System.in);
    private static final String OPTIONMENU = """
            ╔══════════════════════════════════════╗
            ║ CALCULO AREAS DE FIGURAS GEOMÉTRICAS ║
            ╠══════════════════════════════════════╣
            ║ Seleccione una opción:               ║
            ║  1. Calcular Area Circulo.           ║
            ║  2. Calcular Area Cuadrado.          ║
            ║  3. Calcular Area Triángulo.         ║
            ║  4. Salir                            ║
            ╚══════════════════════════════════════╝
            """;

    public static void main(String[] args) {
        boolean continuar;
        do {
            continuar = operaciones();
        } while (continuar && continuarOperando());

        System.out.println("Gracias por usar la aplicación... ¡Hasta luego!");
        reader.close();
    }

    private static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    private static double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    private static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    private static void showMenu() {
        System.out.println(OPTIONMENU);
        System.out.print("Selecciona una opción para operar: ");
    }

    private static boolean operaciones() {
        showMenu();
        String options = reader.nextLine().trim();

        switch (options) {
            case "1":
                procesarCirculo();
                return true;
            case "2":
                procesarCuadrado();
                return true;
            case "3":
                procesarTriangulo();
                return true;
            case "4":
                System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
                return false;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                return true;
        }
    }

    private static void procesarCirculo() {
        double radio = validarNumeroPositivo("Ingrese el valor del Radio del Círculo: ");
        double area = areaCirculo(radio);
        System.out.printf("El área del círculo es: %.2f (m)²%n", area);
    }

    private static void procesarCuadrado() {
        double lado = validarNumeroPositivo("Ingrese el valor del lado del Cuadrado: ");
        double area = areaCuadrado(lado);
        System.out.printf("El área del cuadrado es: %.2f (m)²%n", area);
    }

    private static void procesarTriangulo() {
        double base = validarNumeroPositivo("Ingrese el valor de la base del triángulo: ");
        double altura = validarNumeroPositivo("Ingrese el valor de la altura del triángulo: ");
        double area = areaTriangulo(base, altura);
        System.out.printf("El área del triángulo es: %.2f (m)²%n", area);
    }
    //Metodo para validar la entrada de números positivos
    private static double validarNumeroPositivo(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = reader.nextLine().trim();

            try {
                double valor = Double.parseDouble(input);
                if (valor <= 0) {
                    System.out.println("El valor debe ser positivo.");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }
//Metodo para comprobar si se desea seguir operando
    private static boolean continuarOperando() {
        while (true) {
            System.out.print("\n¿Deseas continuar con otra operación? (S/N): ");
            String input = reader.nextLine().trim().toUpperCase();

            if (input.equals("S")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                System.out.println("Opción no válida. Por favor, ingrese 'S' para sí o 'N' para no.");
            }
        }
    }
}










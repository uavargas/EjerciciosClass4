/*Ejercicio 2 - Verificación de Palíndromos
Definir el Problema:
Un palíndromo es una palabra, frase o secuencia de caracteres que se lee igual de izquierda a derecha que de derecha a izquierda, ignorando espacios, puntuación y mayúsculas.
Ejemplos:

radar
anilina
A man, a plan, a canal, Panama
Estructura del Programa:
Crear un método separado que realice la verificación de si una cadena es un palíndromo.

Interacción con el Usuario:
Pedir al usuario que ingrese una cadena de texto.

Mostrar Resultados:
Después de verificar si la cadena es un palíndromo, mostrar el resultado al usuario en la consola.
Por ejemplo:

Ingresa una cadena de texto: A man, a plan, a canal, Panama

La cadena es un palíndromo.
Ingresa una cadena de texto: Hola

La cadena no es un palíndromo.*/


import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase para verificar si es un palíndromo:");
        String inputText = reader.nextLine();

        // Variable donde capturamos el texto ya limpio
        String cleanedText = limpiarTexto(inputText);
        System.out.println(cleanedText);

        // Hacemos la verificcaion si el texto es  Palindromo.
        if (isPalimdrome(cleanedText)) {
            System.out.println(" =====================================");
            System.out.printf("  La palabra '%s' es Palindromo\n ",cleanedText );
            System.out.println("=====================================");
        }else {
            System.out.println(" =====================================");
            System.out.printf("  La palabra '%s'  No es Palindromo\n ",cleanedText );
            System.out.println("=====================================");
        }

    }

    // Metodo para limpiar de espacios y caracteres la palabra-
    public static String limpiarTexto(String texto) {
        texto = texto.replace(" ", "");// quitamos los espacios entre palabras
        texto = texto.replace(",", ""); // quitamos las comas de las palabras
        texto = texto.replace(".", ""); // Quitamos puntos
        texto = texto.replace("á", "a"); // quitamos las tildes de las vocales
        texto = texto.replace("é", "e");
        texto = texto.replace("í", "i");
        texto = texto.replace("ó", "o");
        texto = texto.replace("ú", "u");
        texto = texto.toLowerCase();// Convertimos la cadena en ninusculas
        return texto;
    }

    //Metodo para comprobar si un texto es Palindromo.
    public static boolean isPalimdrome(String texto) {
        StringBuilder invertirTexto = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) { // Recorremos la palabra en el orden inverso
            invertirTexto.append(texto.charAt(i));
        }
        // Convertimos el StringBuilder a String para compararlo con el texto original
        return invertirTexto.toString().equals(texto);
    }


}

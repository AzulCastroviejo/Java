/*
Ejercicio 3: Sistema de Recomendación de Libros
Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String genero[]={"fantasia", "misterio", "romance", "ciencia ficcion"};
        String eleccion;
        System.out.println("Ingresa el género de libro que te usta y te recomendaremos uno \n fantasia , misterio , romance , ciencia ficcion");
        eleccion = lectura.next().toLowerCase();
        switch (eleccion){
            case "fantasía":
                System.out.println("Te recomendamos leer 'El Señor de los Anillos' de J.R.R. Tolkien.");
                break;
            case "misterio":
                System.out.println("Te recomendamos leer 'El misterio del cuarto amarillo' de Gaston Leroux.");
                break;
            case "romance":
                System.out.println("Te recomendamos leer 'Orgullo y prejuicio' de Jane Austen.");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos leer 'Dune' de Frank Herbert.");
                break;
            default:
                System.out.println("Género no reconocido. Por favor, ingrese un género válido.");
                break;

        }
    }
}

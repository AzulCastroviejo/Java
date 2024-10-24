import java.util.Locale;
import java.util.Scanner;
/*
Ejercicio 1: Sistema de Recomendación de Películas
Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String peliculas []={"acción", "comedia", "drama", "ciencia ficcion"};
        String eleccion;
        System.out.println("Ingresa el género de peliculas que te gustan , para recomendarte peliculas de tu eleccion \n Pueden ser de : acción, comedia, drama, ciencia  ficción");
        eleccion = lectura.next().toLowerCase();
        switch (eleccion){
            case "accion" , "acción":
                System.out.println("Te recomendamos ver -> Mad Max: Fury Road. \n -> Die Hard - Una clásica película de acción protagonizada por Bruce Willis. \n -> The Dark Knight - Una película de superhéroes dirigida por Christopher Nolan.");
                break;
            case "comedia":
                System.out.println("Te recomendamos ver -> Superbad. \n -> Bridesmaids - Una comedia sobre una mujer que lucha con su vida mientras es dama de honor. \n -> The 40-Year-Old Virgin - Una comedia sobre un hombre de 40 años que nunca ha tenido relaciones sexuales.");
                break;
            case "drama":
                System.out.println("Te recomendamos ver -> The Shawshank Redemption. \n -> Forrest Gump - Una película sobre la vida de un hombre con un coeficiente intelectual bajo que logra grandes cosas.");
                break;
            case "ciencia ficcion":
                System.out.println("Te recomendamos ver -> Interstellar. \n -> The Matrix - Una película de ciencia ficción sobre un mundo simulado controlado por máquinas.");
                break;
            default:
                System.out.println("Este género no esta en las recomendaciones.");
                break;
        }
    }
}

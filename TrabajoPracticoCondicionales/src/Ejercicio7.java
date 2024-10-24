
/*
Ejercicio 7: Sistema de Recomendación de Actividades
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String opcion  ;
        System.out.println("Ingresa el estado de animo que tienes hoy para recomendarte una actividad (feliz , triste , energico , relajado :");
        opcion = lectura.nextLine().toLowerCase();

            if (opcion.equals("feliz")){
                System.out.println("Te recomendamos salir a pasear o pasar tiempo con amigos.");

            } else if (opcion.equals("triste")) {
                System.out.println("Te recomendamos ver una película inspiradora o hablar con un amigo.");

            } else if (opcion.equals("energico")) {
                System.out.println("Te recomendamos hacer ejercicio o participar en una actividad deportiva.");

            } else if (opcion.equals("relajado")) {
                System.out.println("Te recomendamos leer un libro o practicar meditación.");

            }else {
                System.out.println("Lo sentimos no tenemos recomendaciones para tu estado de animo .");
            }


    }
}

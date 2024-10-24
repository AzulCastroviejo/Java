import java.util.Locale;
import java.util.Scanner;

/*
Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nivel ;
        System.out.println("Ingresa el nivel de condición física para poder realizarte una rutina semanal (principiante , intermedio y avanzado:");
        nivel = lectura.next().toLowerCase();
        switch (nivel) {
            case "principiante":
                System.out.println(" Rutina de Ejercicio para Principiantes:\n" +
                        "            Lunes: Caminar 30 minutos\n" +
                        "            Martes: Yoga 20 minutos\n" +
                        "            Miércoles: Descanso\n" +
                        "            Jueves: Bicicleta 20 minutos\n" +
                        "            Viernes: Ejercicios de fuerza 15 minutos\n" +
                        "            Sábado: Caminar 30 minutos\n" +
                        "            Domingo: Descanso");
                break;
            case "intermedio":
                System.out.println(" Rutina de Ejercicio para Intermedios:\n" +
                        "            Lunes: Correr 40 minutos\n" +
                        "            Martes: Natación 30 minutos\n" +
                        "            Miércoles: Descanso\n" +
                        "            Jueves: Bicicleta 40 minutos\n" +
                        "            Viernes: Ejercicios de fuerza 25 minutos\n" +
                        "            Sábado: Correr 40 minutos\n" +
                        "            Domingo: Descanso");
                break;
            case "avanzado":
                System.out.println(" Rutina de Ejercicio para Avanzados:\n" +
                        "            Lunes: Correr 60 minutos\n" +
                        "            Martes: Natación 45 minutos\n" +
                        "            Miércoles: Descanso\n" +
                        "            Jueves: Bicicleta 60 minutos\n" +
                        "            Viernes: Ejercicios de fuerza 40 minutos\n" +
                        "            Sábado: Correr 60 minutos\n" +
                        "            Domingo: Descanso");
                break;
            default:
                System.out.println("Nivel de condición física no reconocido.");
                break;
        }


    }
}

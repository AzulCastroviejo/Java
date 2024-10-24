import java.util.Scanner;
/*
Ejercicio 6: Evaluador de Hábitos Saludables
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double horasSueño = 0, horasEjercicio = 0 , comidas = 0;
        System.out.println("Ingresa las horas de sueño que tienes diarias : ");
        horasSueño = lectura.nextDouble();
        System.out.println("Ingresa cuantas horas de ejercicio realizas por dia : ");
        horasEjercicio = lectura.nextDouble();
        System.out.println("Cuantas comidas saludables consumes por dia : ");
        comidas = lectura.nextDouble();
        if (horasEjercicio >= 1) {
            System.out.println("Sus hábitos de ejercicio son buenos.");
        } else {
            System.out.println("Sus hábitos de ejercicio podrían mejorar. Intente hacer al menos 30 minutos de ejercicio al día.");
        }
        if (horasSueño >= 7 && horasSueño <= 9) {
            System.out.println("Sus hábitos de sueño son buenos.");
        } else {
            System.out.println("Sus hábitos de sueño podrían mejorar. Intente dormir entre 7 y 9 horas al día.");
        }
        if (comidas >= 3) {
            System.out.println("Sus hábitos alimenticios son buenos.");
        } else {
            System.out.println("Sus hábitos alimenticios podrían mejorar. Intente consumir al menos 3 comidas saludables al día.");
        }
    }
}

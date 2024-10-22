import java.util.Scanner;
/*
Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Instrucciones:
•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.

 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double estudiar=0, ejercicio=0, leer=0 , tiempo_libre=0, sumar=0;
        int opcion = 1;
        while (opcion <= 4) {
           if (opcion == 1) {
               System.out.println("Ingresa la cantidad de horas diaras le dedicas en el dia a estudiar: ");
               estudiar = lectura.nextDouble();
           } else if (opcion == 2) {
               System.out.println("Ingresa la cantidad de horas diaras le dedicas en el dia a realizar ejercicio: ");
               ejercicio = lectura.nextDouble();
           }else if (opcion ==3) {
               System.out.println("Ingresa la cantidad de horas diaras le dedicas en el dia a leer: ");
               leer = lectura.nextDouble();
           } else if (opcion ==4) {
               System.out.println("Ingresa la cantidad de horas diaras le dedicas en el dia a tener tiempo libre: ");
               tiempo_libre = lectura.nextDouble();
           }
           opcion++;
        }
        sumar = estudiar + ejercicio + leer+ tiempo_libre;
        System.out.println("Estas actividades suman un total de "+sumar+ " horas \n En estudio : "+estudiar+" horas \n En ejercicio : "+ejercicio+" horas \n En lectura : "+leer+" horas \n En tiempo libre : "+tiempo_libre+" horas");

    }
}

import java.util.Scanner;

/*
Ejercicio 2: Cálculo de salarios semanales
Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
Instrucciones:
•	Pide al usuario ingresar la cantidad de empleados.
•	Para cada empleado, pide ingresar las horas trabajadas.
•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int empleados;
        String nombre;
        double horas , salario=0;
        System.out.println("Ingresar cuantos empleados hay en la empresa: ");
        empleados = lectura.nextInt();
        for (int i = 0; i < empleados; i++) {
            System.out.println("Ingresa el nombre del empleado : ");
            nombre = lectura.next();
            System.out.println("Cuantas horas trabajo esta semana : ");
            horas = lectura.nextDouble();
            salario = horas *15;
            System.out.println("El empleado "+nombre+" debe cobrar $"+salario+" esta semana");
        }


    }
}

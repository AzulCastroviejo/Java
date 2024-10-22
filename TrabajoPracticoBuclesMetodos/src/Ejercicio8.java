/*
Ejercicio 8: Control de horas trabajadas
Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.

**Instrucciones**:
- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).

 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String empleados []={"Fernandes","Maximus", "Ronaldo" ,"Di'Stefano"};
        int horasTrabajadas[]={25,36,42,40 };
        int pagos[]= new int[empleados.length];
        pagos = pagoSemanal(horasTrabajadas,empleados);
        imprimir(pagos , empleados);
    }

    public static void imprimir(int [] pagos,String [] empleados){
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("El empleado "+empleados[i]+" tiene de suledo semanal $"+pagos[i]);
        }
    }
    public static int[] pagoSemanal(int [] horasTrabajadas, String [] empleados){
        int pagos[]= new int [empleados.length];
        for (int i = 0; i < empleados.length; i++) {
            pagos[i]= horasTrabajadas[i]*15;
        }
        return pagos;
    }
}


/*Ejercicio 1: Cálculo de ingresos mensuales
        Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.

        **Instrucciones**:
        - Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
        - Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
        - Imprime el total de ingresos mensuales.*/


import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int  ventas []= new int [30];
        double mensual = 0;
        Random num = new Random();
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = num.nextInt(100);
        }

        mensual = calcularIngreso(ventas);
        System.out.println("Las ventas totales del mes son : "+mensual);
    }
    public static double calcularIngreso(int ventas []){
        double mensual =0;
        for (int i = 0; i < ventas.length; i++) {
            mensual += ventas[i];

        }

        return mensual;
        }

    }


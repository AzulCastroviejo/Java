/*
Ejercicio 7: Calculadora de Índice de Felicidad
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int indice = 0 , suma= 0;
        int satisfaccion []= new int [4];
        String[] factores = {"satisfacción con la vida", "salud", "relaciones personales", "logros personales"};

        for (int i = 0; i < satisfaccion.length; i++) {
            System.out.print("Ingrese su nivel de " + factores[i] + " (1-10): ");
            satisfaccion[i]= lectura.nextInt();

            if (satisfaccion[i]>10){
                i -=1;
            }
        }

        for (int i:   satisfaccion ) {
            suma += i;
        }
        suma = suma /4;
        System.out.println("Tu nivel de felicidad es : "+suma);
    }
}

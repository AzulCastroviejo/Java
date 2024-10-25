/*
2. Leer un número N y calcular el factorial de los números desde 0 hasta N.
 */


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n = 0 , factorial = 1 , i = 0;
        System.out.println("Ingresa un número para calcular el factorial : ");
        n = lectura.nextInt();
        i = n ;
        do{
            factorial = factorial * i;
            i -= 1;
        }while (i != 0);

        System.out.println("El factorial de "+n+ " es "+factorial);
    }
}

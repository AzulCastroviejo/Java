
/*
6. Mostrar los números primos desde 2 hasta N
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n = 0 , x = 0, j=0;
        System.out.println("Ingresa el numero que deseeas : ");
        n = lectura.nextInt();
        for (int i = 2; i < n ; i++) {
            j=2;
            while (i % j !=  0 ){
                j++;
            }
            if (i == j){
                System.out.println(i);
            }
        }
    }
}

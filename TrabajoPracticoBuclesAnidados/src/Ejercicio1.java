
/*
1. Mostrar los números perfectos entre 1 y 1000.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int suma = 0, perfecto = 0;
        while (perfecto < 1 || perfecto > 1000){
            System.out.println("Ingresa un número para verificar si es perfecto : ");
            perfecto = lectura.nextInt();
        }


        for (int i = 1 ; i < perfecto; i++) {
            if (perfecto % i == 0){
                suma  += i;
            }
        }

        if (suma  == perfecto){
            System.out.println(perfecto+" es un número PERFECTO");
        }else {
            System.out.println(perfecto+" NO es un número perfecto");
        }

    }
}

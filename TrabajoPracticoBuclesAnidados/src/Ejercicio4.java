
/*
4. Programa que muestre en lineas separadas lo siguiente: ZYWXVUTSRQPONMLKJIHGFEDCBA,
 YWXVUTSRQPONMLKJIHGFEDCBA, WXVUTSRQPONMLKJIHGFEDCBA, ...., DCBA, CBA, BA, A.
 */


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        for (char x = 'A'; x <= 'Z'; x++) {
            for (char y = x; y <= 'Z'; y++) {
                System.out.print(y);
            }
            System.out.println();
        }//HACERLO DE LA A A LA Z

        for (char x = 'Z'; x >= 'A'; x--) {
            for (char y = x; y >= 'A'; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}

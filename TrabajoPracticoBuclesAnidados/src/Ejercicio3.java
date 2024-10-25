import java.util.Scanner;

/*
3. Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n = 0 , factorial = 1 , i = 0 , suma =0 ;
        System.out.println("Ingresa un número para calcular la suma de los factoriales : ");
        n = lectura.nextInt();
        i = n;
        for (int j = 0; j < n; j++) {

            factorial = 1;

            for (int k = 1; k < j; k++) {
                factorial = factorial * i;

            }
            suma += factorial;

        }


        System.out.println("La suma de los factoriales de "+n+ " es "+suma);
    }
}

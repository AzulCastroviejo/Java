import java.util.Scanner;
/*Ejercicio 4: Registro de ventas diarias
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
Instrucciones:
•	Usa un bucle para registrar las ventas diarias durante 7 días.
•	Al final del bucle, muestra el total de ventas de la semana.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int ventas []= new int [7];// creacion del arrgelo ventas
        int dia = 7 ,total=0;
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ingresar el núnero de ventas del día "+(i+1));
            ventas[i]= lectura.nextInt();
        }
        for (int i = 0; i < ventas.length; i++) {
            total+= ventas[i];
        }
        System.out.println("La suma total de ventas en la semna es de "+total);

    }
}

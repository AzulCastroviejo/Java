import java.util.Scanner;

/*
Ejercicio 5: Calculadora de Costo de Viaje
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double distancia =0 , combustible =0 , precio = 0 , total = 0;
        System.out.println("Ingresa la distancia del viaje : ");
        distancia = lectura.nextDouble();
        System.out.println("Ingresa la cantidad de litros utilizados por kilometro : ");
        combustible= lectura.nextDouble();
        System.out.println("Ingresa el precio del combustible por litro : ");
        precio = lectura.nextDouble();
        total = distancia * combustible * precio ;
        System.out.println("El costo total es $"+total);

    }
}

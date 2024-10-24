/*
Ejercicio 2: Calculadora de Descuentos
Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);


        double precio = 0 , descuento = 0;
        String cliente;
        System.out.println("Ingresa el precio de un producto : ");
        precio = lectura.nextDouble();
        System.out.println("Ingresa la categoría del cliente  (estudiante, adulto, jubilado):");
        cliente = lectura.next();
        cliente = cliente.toLowerCase();

        switch (cliente) {
            case "estudiante":
                descuento = precio -(precio* 0.1);
                break;
            case "jubilado":
                descuento = precio -(precio* 0.15);
                break;
            case "adulto":
                descuento = precio -(precio* 0.05);
                break;
            default:
                System.out.println("Esta categoria no tiene descuento");
                break;
        }
        System.out.println("El precio con descuento es $"+descuento + " del precio original $"+precio);
    }
}

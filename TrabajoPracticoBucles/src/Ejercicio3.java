import java.util.Scanner;
/*
Ejercicio 3: Control de inventario
Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
Instrucciones:
•	Pide al usuario ingresar el número de productos.
•	Usa un bucle para ingresar la cantidad disponible de cada producto.
•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int cantidad =0 ,producto=0;
        String nombre ;
        System.out.println("Ingresa la cantidad de productos que deseas determinar ");
        producto = lectura.nextInt();
        while (producto !=0){
            System.out.println("Ingresa el producto : ");
            nombre = lectura.next();
            System.out.println("Ingrese la cantidad de "+nombre+" que tiene en el inventario :");
            cantidad = lectura.nextInt();
            if (cantidad<5){
                System.out.println("Necesitas realizar un pedido de "+nombre+" ya que solo quedan "+cantidad);
            }
            producto-=1;
        }

    }
}

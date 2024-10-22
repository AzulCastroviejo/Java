import java.util.Scanner;

/*
Ejercicio 3: Gestión de clientes
Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.

**Instrucciones**:
- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.

 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String clientes[]= {"Martin Federich" , "Jorgelina Matheus", "Maria Julet" , "Lucas Montegro" , "Martin luke"};
        double facturasPendientes []= {62 , 560.3 , 45,5500 , 36};
        enviarFacturas(clientes , facturasPendientes);

    }

    public static void enviarFacturas(String[] clientes , double[] facturas ){
        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i]>500){
                System.out.println("El cliente : "+clientes[i]+" tiene una factura de $"+facturas[i]);
            }
        }
    }
}

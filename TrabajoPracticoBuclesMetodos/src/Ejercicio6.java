import java.util.Scanner;
import java.text.DecimalFormat;

/*Ejercicio 6: Cálculo de impuestos
Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.

**Instrucciones**:
- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double facturas[] = {50200.30 , 85031.2 ,80500.6 , 20000 , 24400.30};
        System.out.println("Facturas sin IVA : ");
        imprimir(facturas);
        facturas=  calcularImpuestos(facturas);
        System.out.println("Facturas con IVA :");
        imprimir(facturas);
    }
    public static void imprimir(double [] facturas){

        DecimalFormat df = new DecimalFormat("#.00");//nos da el formato decimal con 2 decimales
        for(double i:facturas){
            System.out.println(df.format(i));
        }
    }

    public static double[] calcularImpuestos(double [] facturas){

        for (int i = 0; i < facturas.length; i++) {
            facturas[i] += (facturas[i]*0.21);

        }
        return facturas;
    }
}

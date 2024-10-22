import java.util.Scanner;

/*


 Ejercicio 9: Calcular el precio final con descuentos
Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.

**Instrucciones**:
- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.


 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double precioOriginal[]= {650.3,253.6,854.25,980.3,450.23};
        precioOriginal = calcularPrecioFinal(precioOriginal);
        System.out.println("Precio con 10% de descuento");
        imprimir(precioOriginal);

    }

    public static void imprimir(double [] preciofinal){

        for (double i:preciofinal){
            System.out.println(i);
        }
    }
    public static double[] calcularPrecioFinal(double [] precioOriginal){

        for (int i = 0; i < precioOriginal.length; i++) {
            precioOriginal[i]= precioOriginal[i]-(precioOriginal[i]*0.1);
        }
        return precioOriginal;
    }
}

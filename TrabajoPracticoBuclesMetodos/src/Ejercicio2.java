import java.util.Scanner;

/* Ejercicio 2: Generar reportes de inventario
Una tienda de electrónica necesita un informe del inventario, mostrando los productos que tienen menos de 5 unidades en stock.

**Instrucciones**:
- Crea un arreglo `productos` que almacene los nombres de los productos y otro arreglo `stocks` que almacene la cantidad de stock de cada producto.
- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.

public class Inventario {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int[] stocks = {3, 10, 2, 6, 4};

        generarReporteBajoStock(productos, stocks);
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - Unidades: " + stocks[i]);
            }
        }
    }
}
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int[] stocks = {3, 10, 2, 6, 4};
        generarReporteBajoStock(productos,stocks);
    }
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < 5){
                System.out.println("El producto "+productos[i] +" tiene menos de 5 unidades");
            }
        }
    }
}

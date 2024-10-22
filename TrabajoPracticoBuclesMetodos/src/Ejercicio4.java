import java.util.Scanner;

/* Ejercicio 4: Cálculo de descuentos para fidelización
Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado. Si han comprado más de 10 veces, reciben un 10% de descuento.

**Instrucciones**:
- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.

*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int compras[]= {15,5,8,52,6,30};
        String clientes[]= {"Laura" , "Matias" , "Federica" , "Florencia" , "Mariana" ,"Pablo"};
        calcularDescuento(compras,clientes);
    }

    public static void calcularDescuento(int [] compras,String [] clientes){
        Scanner lectura = new Scanner(System.in);

        double venta =0;
        for (int i = 0; i < compras.length; i++) {
            if (compras[i]>=10){
                System.out.println("Ingresa el precio final de su factura para darle a "+clientes[i]+ " el descuento del 10%");
                venta = lectura.nextDouble();
                venta = venta - (venta*0.1);
                System.out.println("El precio a pagar con el descuento es $"+venta);
            }else {
                System.out.println(clientes[i]+" No tiene descuento");
            }

        }
    }
}

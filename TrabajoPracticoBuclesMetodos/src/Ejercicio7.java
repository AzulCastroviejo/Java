
/*
Ejercicio 7: Descuento por compras grandes
Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

**Instrucciones**:
- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.

 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double compras[] = {420, 620, 150, 230, 480, 658, 700};
        compras = aplicarDescuento(compras);
        for (double i : compras) {
            System.out.println(i);
        }

    }

    public static double[] aplicarDescuento(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] >= 500) {
                System.out.println("Esta compra $" + compras[i] + " tendra 15% descuento");
                compras[i] = compras[i] - (compras[i] * 0.15);
            }
        }

        return compras;

    }
}



import java.util.Scanner;

/*

Ejercicio 5: Promedio de satisfacción del cliente
Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.

**Instrucciones**:
- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.

 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int calificaciones[]= {1,5,3,2,4,4,4,1,5,3};
        calculaPromedio(calificaciones);

    }

    public static void calculaPromedio(int [] calificaciones){
        int promedio=0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        promedio = promedio/(calificaciones.length);
        System.out.println("El promedio de satifaccion es : "+promedio);
    }
}

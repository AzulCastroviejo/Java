import java.util.Scanner;

/*Ejercicio 5: Cálculo de horas extras
Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
Instrucciones:
•	Pide al usuario ingresar el número de empleados.
•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int empleados = 0, hora = 3000 , x = 1;
        double horas=0 , extra=0 , sueldo =0;
        System.out.println("Ingresa la cantidad de empleados : ");
        empleados = lectura.nextInt();
         do {
             System.out.println("Ingresa las horas trabajadas en la semana por el empleado "+ x);
             horas = lectura.nextDouble();
             if (horas > 40){
                 extra = horas - 40;
                 sueldo = (40*hora)+ ((hora +1500)*extra);
                 System.out.println("El sueldo del empleado "+x+ " es  $"+sueldo+ " tiene "+extra+" horas extras");
             }else{
                 sueldo = (horas*hora);
                 System.out.println("El sueldo del empleado "+x+ " es  $"+sueldo+ " no tiene horas extra");
             }
             x +=1;
             empleados -=1;
         }while(empleados !=0);

    }
}

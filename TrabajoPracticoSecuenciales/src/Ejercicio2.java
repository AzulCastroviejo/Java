import java.util.Scanner;
/*
Ejercicio 2: Calculadora de Calorías Quemadas
Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double peso = 0 , min = 0, calorias = 0, ts = 0;
        String ejercicio ;
        System.out.println("Ingresa tu peso : ");
        peso = lectura.nextDouble();
        System.out.println("Ingresa el ejercicio que realizaste (correr , nadar , bicicleta ):  ");
        ejercicio = lectura.next();
        ejercicio = ejercicio.toLowerCase();
        System.out.println("Cuanto tiempo realizaste el ejercicio en minutos : ");
        min = lectura.nextDouble();


        switch (ejercicio){
            case "correr":
                ts = 0.7;
                calorias = caloriasQuemadas(peso , min ,ts) ;
                break;
            case "nadar":
                ts = 0.5;
                calorias = caloriasQuemadas(peso , min ,ts) ;
                break;
            case "andar en bicicleta":
                ts = 0.4;
                calorias = caloriasQuemadas(peso , min ,ts) ;
                break;
            default:
                System.out.println("Tipo de ejercicio no reconocido.");
                return;
        }
        System.out.println("Las calorias quemadas por "+ejercicio+" durante "+min+" minutos son "+calorias);
    }

    public static double caloriasQuemadas(double peso , double min ,double caloria){

        double caloriasQ =0;
        caloriasQ = peso*caloria*min;
        return caloriasQ;

    }
}

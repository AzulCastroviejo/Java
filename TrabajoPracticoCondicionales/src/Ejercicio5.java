
/*
Ejercicio 5: Juego de Piedra, Papel o Tijera
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();
        String eleccion , eleccionPro ;
        String opcion []= {"piedra" , "papel" , "tijera"};
        System.out.println("Ingresa tu opcion (piedra , papel o tijera) :");
        eleccion = lectura.nextLine().toLowerCase();
        eleccionPro = opcion[random.nextInt(opcion.length)];

        if (eleccionPro.equals(eleccion)){
            System.out.println("Ambos eigieron "+eleccion+ " hay un EMPATE");
        } else if (eleccion.equals("piedra") && eleccionPro.equals("tijera") ||
            eleccion.equals("papel")&& eleccionPro.equals("piedra") || eleccion.equals("tijera")&& eleccionPro.equals("papel")){
            System.out.println("Felicitaciones GANASTE con tu "+eleccion+ " contra "+eleccionPro);
            }else {
            System.out.println("Lo sentimos perdiste con tu "+eleccion+" contra "+eleccionPro);
        }

    }
}

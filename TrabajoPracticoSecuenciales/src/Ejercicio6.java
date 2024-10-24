import java.util.Scanner;

/*
Ejercicio 6: Generador de Planes de Estudio
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double horas = 0;
        System.out.println("Ingresa la cantidad de horas por dia que puedes estudiar : ");
        horas = lectura.nextDouble();
        String materias[] = {"Matemáticas", "Ciencias", "Historia", "Literatura", "Idiomas"};
        horas =( horas *7) /5;
        for (String materia : materias) {
            System.out.println(materia + ": " + horas + " horas por semana");
        }
    }
}

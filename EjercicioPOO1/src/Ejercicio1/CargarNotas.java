package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargarNotas {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String nombre , opc = "SI" , opcion = "SI" , catedra;
        double nota =0;
        long legajo;
        while (opc.toUpperCase().equals("SI")){

            System.out.println("Ingresa el nombre del alumno : ");
            nombre = lectura.next();
            System.out.println("Ingresa el legajo : ");
            legajo = lectura.nextLong();
            Alumno alumno = new Alumno(nombre , legajo);
            alumnos.add(alumno);
            while (opcion.toUpperCase().equals("SI")){
                System.out.println("Ingresa la catedra que deseas : ");
                catedra = lectura.next();
                System.out.println("Ingresa la nota de esta catedra : ");
                nota = lectura.nextDouble();
                Nota n= new Nota(catedra , nota);
                alumno.agregarNota(n);
            }
            System.out.println("Deseas agregar un nuevo alumno SI / NO :");
            opc = lectura.next();

        }
    }
}

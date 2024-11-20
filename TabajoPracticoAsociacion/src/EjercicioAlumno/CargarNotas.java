package EjercicioAlumno;

import java.util.Scanner;

public class CargarNotas {

    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        String nombre, opc = "SI";
        long legajo;
        System.out.println("Ingresa el nombre del alumno : ");
        nombre = lectura.next();
        System.out.println("Ingresa el legajo de "+nombre);
        legajo = lectura.nextLong();
        Alumno alumno = new Alumno(nombre , legajo);
        while(opc.toUpperCase().equals("SI") ){
            double nota_examen ;
            String catedra;
            System.out.println("Ingresa la catedra : ");
            catedra = lectura.next();
            System.out.println("Ingresa la nota : ");
            nota_examen = lectura.nextDouble();
            Nota nota = new Nota(catedra , nota_examen);
            alumno.agregar_nota(nota);
            System.out.println("Desea agregar una nueva nota SI/NO : ");
            opc = lectura.next().toUpperCase();

        }
        imprimir(alumno);
    }
    
    public static void imprimir(Alumno alumno){

        System.out.println("El alumno "+alumno.getNombre_completo() + " con el legajo "+ alumno.getLegajo());
        System.out.println("Sus notas son : ");
        alumno.imprimir_nota();
    }
}

package Ejemplo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Curso c1= new Curso("Matematica");
        Persona p1 = new Persona("PEPE" , 15 );
        p1.setCurso(c1);
        System.out.println(p1.getNombre() + " ESTÁ CURSANDO "+ p1.getCurso().getNombre());
        Auto auto1 = new Auto("Toyota");
        Auto auto2 = new Auto("Chevrolet");
        Auto auto3 = new Auto("Ferrari");
        p1.agregarAutos(auto1);
        p1.agregarAutos(auto2);
        p1.agregarAutos(auto3);
        System.out.println("la persona "+ p1.getNombre() +" tiene " + p1.getAutos().size() + " autos de la marca "  );
        p1.mostrarAutos();

    }
}

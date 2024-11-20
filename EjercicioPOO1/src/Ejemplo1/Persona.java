package Ejemplo1;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private int edad;
    private Curso curso;

    private ArrayList<Auto> autos = new ArrayList<>();
    public Persona(String nombre, int edad ) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Quiero asignar el valor al atributo utilizo set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Quiero mostrar el dato uso get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void agregarAutos(Auto auto) {
        autos.add(auto);

    }
    public void mostrarAutos(){

        for (Auto auto : autos) {
            System.out.println("La marca del auto es " + auto.getMarca());
        }


    }
}

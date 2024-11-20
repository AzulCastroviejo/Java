package EjercicioAlumno;

import java.util.ArrayList;

public class Alumno {
    private String nombre_completo ;
    private long legajo;
    private ArrayList <Nota> notas = new ArrayList<>();

    public Alumno(String nombre_completo, long legajo) {
        this.nombre_completo = nombre_completo;
        this.legajo = legajo;

    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;

    }
    public void agregar_nota(Nota nota){
        notas.add(nota);
    }

    public void imprimir_nota(){

        for (Nota nota: notas) {
            System.out.println("En la catedra -> "+nota.getCatedra()+ " tiene como nota -> "+nota.getNota_examen());
        }
    }
}

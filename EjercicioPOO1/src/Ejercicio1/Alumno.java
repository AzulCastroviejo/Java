package Ejercicio1;

import java.util.ArrayList;

public class Alumno {

    private String nombreCompleto;
    private long legajo;

    private ArrayList<Nota> notas = new ArrayList<>();

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public void agregarNota(Nota n){

    }
}

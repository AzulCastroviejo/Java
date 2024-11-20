package EjercicioPlato;

import java.util.ArrayList;

public class Plato {
    private String nombre;
    private double precio;
    private boolean es_bebida;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public Plato(String nombre, double precio, boolean es_bebida) {
        this.nombre = nombre;
        this.precio = precio;
        this.es_bebida = es_bebida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEs_bebida() {
        return es_bebida;
    }

    public void setEs_bebida(boolean es_bebida) {
        this.es_bebida = es_bebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregar_ingrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void imprimir(){

        System.out.println("Ingredientes : ");
        for (Ingrediente ingrediente :ingredientes) {
            System.out.println("---------------");
            System.out.println(ingrediente.getNombre());
            System.out.println(ingrediente.getCantidad()+ "  " + ingrediente.getUnidad_medida());

        }



    }
}

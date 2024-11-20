package EjemploHerenciaPolimorfismo;
// extends es para heredar
public class Alumno extends Persona{
    private int legajo;


    // @ -> anotacion Override  sobreescribir el metodo abstracto heredado
    @Override
    public void estudiar() {
        System.out.println(" Yo estudio como alumno Estudiante ");
    }

    public Alumno(String nombre, int edad, int legajo) {
        super(nombre, edad);// super me trae de la clase padre los atributos del padre
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}

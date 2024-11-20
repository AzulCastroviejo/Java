package EjemploHerenciaPolimorfismo;

public abstract class Persona {
    protected String nombre ;
    protected  int edad ;

    public abstract void estudiar();// metodo abstracto solo se nombra en el padre y despues en el hijo se le dan los atributos

    public void  comer(){
        System.out.println("Soy Persona y como ");
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar(){
        System.out.println("Mi nombre es "+ nombre + " y tengo "+ edad);
    }
}

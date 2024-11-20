package EjemploHerenciaPolimorfismo;

public  class Profesor extends Persona implements  Volador{
    private  String titulo;

    @Override
    public void estudiar() {
        System.out.println("Estudia como profesor");
    }

    public Profesor(String nombre, int edad, String titulo) {
        super(nombre, edad);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void volar() {
        System.out.println("Yo vuelo algunos vines de semana xd");
    }
}

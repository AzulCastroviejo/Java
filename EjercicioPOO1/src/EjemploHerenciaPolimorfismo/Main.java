package EjemploHerenciaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Alumno alumno  = new Alumno("Alejo" , 25 , 5554);
        alumno.mostrar();
        Profesor profe = new Profesor("Martina ", 26 , "Publicista");
        System.out.println("La profesora " + profe.nombre + " y es  " + profe.getTitulo()+ "  " );
        profe.volar();
    }
}

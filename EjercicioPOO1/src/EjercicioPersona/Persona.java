package EjercicioPersona;

public class Persona {

    private String nombre;
    private String apellido;
    private String numeroDocumentoIdentidad;
    private int anoNacimeinto;
    private String pais;
    private char sexo;

    public Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int anoNacimeinto, String pais, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anoNacimeinto = anoNacimeinto;
        this.pais = pais;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public int getAnoNacimeinto() {
        return anoNacimeinto;
    }

    public void setAnoNacimeinto(int anoNacimeinto) {
        this.anoNacimeinto = anoNacimeinto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void mostrar(){
            System.out.println("La persona " + nombre + " " + apellido+" con documento = "+numeroDocumentoIdentidad + " el año de nacimiento es "+anoNacimeinto+ " nacio en "+pais+" y su sexo es "+sexo);

    }
    public static void main(String[] args){
        Persona p1 = new Persona("Ariel" , "Mar" , "45215456",1999 , "Oceano" ,'M');
        Persona p2 = new Persona("Nemo" , "Ocenao" , "2222222",1999 , "EEUU" ,'H');
        p1.mostrar();
        p2.mostrar();
    }

}

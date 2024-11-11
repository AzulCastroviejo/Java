package EjercicioPlaneta;

public class Planeta {

    private  String nombre;
    private int cantidad_satelite ;
    private double masa;
    private  double volumen ;
    private int diametro;
    private int distancia_sol;
    private String tipo_planeta;
    private boolean es_observable;
    private  double periodo_orbital;
    private  double periodo_rotacion;

    public Planeta(String nombre, int cantidad_satelite, double masa, double volumen, int diametro, int distancia_sol, String tipo_planeta, boolean es_observable, double periodo_orbital, double periodo_rotacion) {
        this.nombre = nombre;
        this.cantidad_satelite = cantidad_satelite;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipo_planeta = tipo_planeta;
        this.es_observable = es_observable;
        this.periodo_orbital = periodo_orbital;
        this.periodo_rotacion = periodo_rotacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_satelite() {
        return cantidad_satelite;
    }

    public void setCantidad_satelite(int cantidad_satelite) {
        this.cantidad_satelite = cantidad_satelite;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public boolean isEs_observable() {
        return es_observable;
    }

    public void setEs_observable(boolean es_observable) {
        this.es_observable = es_observable;
    }

    public double getPeriodo_orbital() {
        return periodo_orbital;
    }

    public void setPeriodo_orbital(double periodo_orbital) {
        this.periodo_orbital = periodo_orbital;
    }

    public double getPeriodo_rotacion() {
        return periodo_rotacion;
    }

    public void setPeriodo_rotacion(double periodo_rotacion) {
        this.periodo_rotacion = periodo_rotacion;
    }

    public String getTipo_planeta() {
        return tipo_planeta;
    }

    public void setTipo_planeta(String tipo_planeta) {
        this.tipo_planeta = tipo_planeta;
    }

    public  void imprimir(){
        System.out.println("PLANETA -> "+nombre);
        System.out.println("CANTIDAD DE PLANETAS -> "+cantidad_satelite);
        System.out.println("MASA DEL PLANETA -> "+masa);
        System.out.println("VOLUMEN DEL PLANETA -> "+volumen);
        System.out.println("DIAMETRO DE "+nombre+ " -> "+diametro);
        System.out.println("DISTANCIA AL SOL -> "+distancia_sol);
        System.out.println("TIPO DE PLANETA -> "+tipo_planeta);
        if (es_observable){
            System.out.println("ES OBSERVABLE");
        }else {
            System.out.println("NO ES OBSERVABLE");
        }
        System.out.println("EL PERIODO ORBITAL-> " + periodo_orbital);
        System.out.println("EL PERIODO ORBITAL "+periodo_rotacion+ " DIAS");

    }

    public static void main(String[] args){
        Planeta planeta1 = new Planeta("Jupiter", 79 , 1.89927, 1.4313 , 129820, 750000000 , "Gaseoso", true , 1.3267658771745 , 12);
        planeta1.imprimir();
    }
}

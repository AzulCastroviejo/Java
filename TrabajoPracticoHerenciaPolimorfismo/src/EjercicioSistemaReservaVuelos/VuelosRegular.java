package EjercicioSistemaReservaVuelos;

public class VuelosRegular extends Vuelos implements Promocionable{
    private int numeroAsientos;
    private double precioAsiento;

    public VuelosRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioAsiento = precioAsiento;
    }

    @Override
    public double calcularPrecio() {
        return precioAsiento * numeroAsientos;
    }

    @Override
    public void aplicarPromocion() {

    }
}

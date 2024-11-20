package EjercicioSistemaReservaVuelos;

public class VuelosCharter extends Vuelos implements Promocionable{

    private int precioTotal;

    public VuelosCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {

    }
}

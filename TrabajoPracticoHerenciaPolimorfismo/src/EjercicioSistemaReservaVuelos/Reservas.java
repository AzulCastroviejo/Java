package EjercicioSistemaReservaVuelos;

import java.util.ArrayList;

public class Reservas {
    private ArrayList<Vuelos> vuelos;

    public Reservas() {
        this.vuelos = vuelos;
    }
    public void agregarVuelo(Vuelos vuelo) {
        vuelos.add(vuelo);
    }
    public double calcularPrecioTotal() {
        double total = 0;
        for (Vuelos vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }
    public void aplicarPromociones() {
        for (Vuelos vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }
    public void mostrarInformacion() {
        for (Vuelos vuelo : vuelos) {
            System.out.println("Número de Vuelo: " + vuelo.getNumeroVuelo());
            System.out.println("Origen: " + vuelo.getOrigen());
            System.out.println("Destino: " + vuelo.getDestino());
            System.out.println("Fecha: " + vuelo.getFecha());
            System.out.println("Precio: " + vuelo.calcularPrecio());
            System.out.println();
        }
    }
}

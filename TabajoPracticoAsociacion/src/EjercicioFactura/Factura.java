package EjercicioFactura;

import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private  long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    public Factura(String fechaFactura, long numeroFactura, double totalCalculadoFactura, String cliente) {
        this.fechaFactura = fechaFactura;
        this.numeroFactura = numeroFactura;
        this.totalCalculadoFactura = totalCalculadoFactura;
        this.cliente = cliente;
        this.detallesFactura = new ArrayList<>();
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void agregar_detalle(DetalleFactura detalleFactura){
        this.detallesFactura.add(detalleFactura);
    }

    public void calcularTotal(){
        totalCalculadoFactura = 0;
        for (DetalleFactura detalleFactura: detallesFactura) {
            totalCalculadoFactura += detalleFactura.getSubtotal();
        }

    }
    public  void imprimirDetalle(){
        System.out.printf("%-15s %-15s %-10s %-15s %-10s %-10s\n",
                "Código Articulo", "Nombre Articulo", "Cantidad", "Precio Unitario", "Descuento", "Subtotal");
        for (DetalleFactura detalle : detallesFactura) {
          System.out.printf("%-15s %-15s %-10d %-15.2f %-10.2f %-10.2f\n", detalle.getCodigoArticulo(), detalle.getNombreArticulo(), detalle.getCantidad(), detalle.getPrecioUnitario(), detalle.getDescuentoItem(), detalle.getSubtotal());
        }
            System.out.println("Total: " + totalCalculadoFactura);
    }

}


package EjercicioFactura;

import java.util.Scanner;

public class Fcaturacion {

    private static String[][] articulos = { {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static  void main (String[] args){
        Scanner lectura = new Scanner(System.in);
        String fechaFactura , opc, cliente , codigo , nombreArticulo , precioArticulo ;
        double totalFacturado = 0 , subtotal =0 , descuentoItem= 0 ,  precioUnitario =0;
        long numeroFactura = 0;
        int x , cantidad = 0 ;

        System.out.println("Ingreesa la fecha d ela factura : ");
        fechaFactura = lectura.next();
        while (true){
            System.out.println("Ingresa el numero de factura :  ");
            numeroFactura = lectura.nextLong();
            if (numeroFactura > 0){
                break;
            }else {
                System.out.println("El número de factura tiene que ser mayor a 0 ");
            }
        }

        System.out.println("Ingresa en el cliente : ");
        cliente = lectura.next();
        Factura factura = new Factura(fechaFactura, numeroFactura,totalFacturado, cliente);

        while (true){
            System.out.println("");
            System.out.println("Ingresa el código del artículo que deseas agrregar a la facturacion : ");
            codigo = lectura.next();
            x = -1;
            for (int i = 0; i < articulos.length; i++) {
                if (articulos[i][0].equals(codigo)){
                    x = i;
                    break;
                }
            }
            if (x == -1){
                System.out.println("Codigo erroneo ");
                continue;
            }
            System.out.println("Ingrese la cantidad de articulos que desea : ");
            cantidad = lectura.nextInt();
            nombreArticulo = articulos[x][1];
            precioUnitario = Double.parseDouble(articulos[x][2]) ;
            if (cantidad>5){
                descuentoItem = precioUnitario*0.1;
            }else {
                descuentoItem = 0;
            }
            subtotal =( precioUnitario-descuentoItem) *  cantidad;
            DetalleFactura detalleFactura=new DetalleFactura(codigo, nombreArticulo, cantidad , precioUnitario, descuentoItem , subtotal);
            factura.agregar_detalle(detalleFactura);
            System.out.println("Desea agregar otro articulo SI / NO : ");
            opc = lectura.next();
            if (opc.toUpperCase().equals("NO")){
                System.out.println("No se agregaran mas articulos");
                break;
            }else {
                System.out.println("Nuevo artículo");
            }
        }


        factura.calcularTotal();

        System.out.println("\nFecha: " + factura.getFechaFactura()); System.out.println("Numero de Factura: " + factura.getNumeroFactura()); System.out.println("Cliente: " + factura.getCliente());
        factura.imprimirDetalle();
    }
}

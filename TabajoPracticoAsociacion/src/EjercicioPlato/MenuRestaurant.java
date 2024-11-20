package EjercicioPlato;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {

    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        ArrayList<Plato> platos = new ArrayList<>();
        String opc ="SI" , nombre_plato ,unidad_medida , nombre_ingrediente , x ;
        double precio= 0 , cantidad = 0;
        boolean es_bebida = true;
        while(opc.toUpperCase().equals("SI")) {
            System.out.println("Ingresa el nombre del plato que deseas crear : ");
            nombre_plato = lectura.next();
            System.out.println("Ingresa el precio del plato $");
            precio = lectura.nextDouble();
            System.out.println("Es una bebida SI / NO :");
            x = lectura.next();
            if (x.toUpperCase().equals("NO")) {
                es_bebida = false;
            }
            Plato plato1 = new Plato(nombre_plato, precio, es_bebida);
            String  in = "SI";
            while (in.equals("SI") && es_bebida == false) {
                System.out.println("Ingresa el ingrediente : ");
                nombre_ingrediente = lectura.next();
                System.out.println("Cantidad de " + nombre_ingrediente + " que lleva ");
                cantidad = lectura.nextDouble();
                System.out.println("Unidad de medida : ");
                unidad_medida = lectura.next();
                Ingrediente ingrediente = new Ingrediente(nombre_ingrediente, cantidad, unidad_medida);
                plato1.agregar_ingrediente(ingrediente);
                System.out.println("Deseas ingresar un nuevo ingrediente SI/NO :");
                in = lectura.next().toUpperCase();

            }
            platos.add(plato1);
            System.out.println("Desea agregar un nuevo plato SI/NO : ");
            opc = lectura.next();
        }

        System.out.println("-----MENÚ-----");

        for (Plato plato :platos) {
            System.out.println("       ");
            System.out.println(plato.getNombre());
            System.out.println("Precio : $"+plato.getPrecio());
            if (plato.isEs_bebida() == false){
                plato.imprimir();
            } else {
                System.out.println("Es una bebida");

            }

        }



    }

}

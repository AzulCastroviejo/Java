import java.util.Scanner;
/*
Ejercicio 1: Generador de Horóscopo
Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String fecha , signo;
        int dia =0, mes =0;
        System.out.println("Ingresa tu fecha de nacimiento en formato DD/MM/AAAA");
        fecha = lectura.nextLine();
        String [] partes = fecha.split("/");
        dia = Integer.parseInt(partes[0]);
        mes = Integer.parseInt(partes[1]);
        signo = obtenerSignoZodiaco(dia , mes);
        horoscopo(signo);
    }

    public static void horoscopo(String signo){
        switch (signo) {
            case "Aries":
                System.out.println("Hola "+signo);
                System.out.println("Hoy es un día lleno de energía y entusiasmo. ¡Aprovecha cada momento!");
                break;
            case "Tauro":
                System.out.println("Hola "+signo);
                System.out.println("La paciencia y la perseverancia serán clave hoy. ¡No te rindas!");
                break;
            case "Géminis":
                System.out.println("Hola "+signo);
                System.out.println("La comunicación será tu fuerte hoy. ¡Aprovecha para expresar tus ideas!");
                break;
            case "Cáncer":
                System.out.println("Hola "+signo);
                System.out.println("Un día para estar en contacto con tus emociones y los seres queridos.");
                break;
            case "Leo":
                System.out.println("Hola "+signo);
                System.out.println("Tu carisma y liderazgo serán notables hoy. ¡Brilla con todo tu esplendor!");
                break;
            case "Virgo":
                System.out.println("Hola "+signo);
                System.out.println("La atención a los detalles será crucial hoy. ¡Tu organización será clave!");
                break;
            case "Libra":
                System.out.println("Hola "+signo);
                System.out.println("La armonía y el equilibrio serán tu fuerte hoy. ¡Disfruta de la belleza!");
                break;
            case "Escorpio":
                System.out.println("Hola "+signo);
                System.out.println("Un día para explorar tus emociones más profundas. ¡Sé auténtico!");
                break;
            case "Sagitario":
                System.out.println("Hola "+signo);
                System.out.println("La aventura y la libertad serán tus aliadas hoy. ¡Explora nuevos horizontes!");
                break;
            case "Capricornio":
                System.out.println("Hola "+signo);
                System.out.println("La disciplina y la responsabilidad serán tus pilares hoy. ¡Sigue adelante!");
                break;
            case "Acuario":
                System.out.println("Hola "+signo);
                System.out.println("La innovación y la creatividad serán tu fuerte hoy. ¡Sé original!");
                break;
            case "Piscis":
                System.out.println("Hola "+signo);
                System.out.println("Un día para soñar y conectar con tu intuición. ¡Deja volar tu imaginación!");
                break;
            default:
                System.out.println("Signo del zodiaco no reconocido.");
                break;
        }
    }

    public static String obtenerSignoZodiaco(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }
}

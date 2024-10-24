/*
Ejercicio 4: Generador de Listas de Reproducción
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String animo ;
        System.out.println("Quieres escuchar buenas canciones \n" +
                "Cual es tu estado anímico (feliz, triste, enérgico, relajado) para recomendarte las mejores canciones :");
        animo = lectura.next();
        switch (animo.toLowerCase()) {
            case "feliz":
                System.out.println(" Lista de Reproducción para un dia  Feliz:\n"  +
                        "            1. Happy - Pharrell Williams\n" +
                        "            2. Don't Stop Me Now - Queen\n" +
                        "            3. Good Life - OneRepublic\n" +
                        "            4. Walking on Sunshine - Katrina and the Waves\n" +
                        "            5. Can't Stop the Feeling! - Justin Timberlake");
                break;
            case "triste":
                System.out.println("Lista de Reproducción para un dia Triste:\n" +
                        "            1. Someone Like You - Adele\n" +
                        "            2. Fix You - Coldplay\n" +
                        "            3. Hallelujah - Leonard Cohen\n" +
                        "            4. The Scientist - Coldplay\n" +
                        "            5. Yesterday - The Beatles");
                break;
            case "enérgico":
                System.out.println(" Lista de Reproducción para un dia Enérgico:\n" +
                        "            1. Eye of the Tiger - Survivor\n" +
                        "            2. Stronger - Kanye West\n" +
                        "            3. Titanium - David Guetta ft. Sia\n" +
                        "            4. Pump It - The Black Eyed Peas\n" +
                        "            5. Turn Down for What - DJ Snake & Lil Jon");
                break;
            case "relajado":
                System.out.println(" Lista de Reproducción para un dia Relajado:\n" +
                        "            1. Weightless - Marconi Union\n" +
                        "            2. Clair de Lune - Claude Debussy\n" +
                        "            3. Spiegel im Spiegel - Arvo Pärt\n" +
                        "            4. Gymnopédie No. 1 - Erik Satie\n" +
                        "            5. The Sound of Silence - Simon & Garfunkel");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido.");
                break;
        }


    }
}

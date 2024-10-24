import java.util.Scanner;

/*
Ejercicio 4: Calculadora de IMC con Recomendaciones
Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad).
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double altura =0,peso = 0 , imc=0;
        String recomendacion;

        System.out.println("Calcularemos tu IMC ");
        System.out.println("Ingresa tu peso en kilogramos: ");
        peso = lectura.nextDouble();
        System.out.println("Ingresa tu altura en metros : ");
        altura = lectura.nextDouble();
        imc = peso / (altura*altura);

        if (imc < 18.5) {
            recomendacion = "Bajo peso. Considere aumentar su ingesta calórica y consultar a un profesional de la salud.";
        } else if (imc >= 18.5 && imc < 24.9) {
            recomendacion = "Peso normal. Mantenga un estilo de vida saludable.";
        } else if (imc >= 25 && imc < 29.9) {
            recomendacion = "Sobrepeso. Considere hacer ejercicio regularmente y consultar a un profesional de la salud.";
        } else {
            recomendacion = "Obesidad. Considere hacer cambios significativos en su dieta y estilo de vida, y consultar a un profesional de la salud.";
        }

        System.out.printf("Tu IMC es "+imc+" "+recomendacion);
    }
}

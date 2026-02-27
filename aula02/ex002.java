/* Área de um retângulo: Peça a largura e a altura de um retângulo e calcule a área. */

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        double largura, altura;

        System.out.println("------- ÁREA DE UM RETÂNGULO -------");
        System.out.print("Largura do retângulo em centímetros: ");
        largura = leitor.nextDouble();
        System.out.print("Altura do retângulo em centímetros: ");
        altura = leitor.nextDouble();

        System.out.println("A área do retângulo é de " + df.format(largura * altura) + "cm².");
    }
}

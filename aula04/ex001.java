import java.util.Scanner;

class ex001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        media = ((nota1 + nota2) / 2);

        System.out.println("Média = " + media);

        if (media >= 10) {
            System.out.println("Estudante aprovado");
        } else {
            System.out.println("Estudante reprovado");
        }
    }
}
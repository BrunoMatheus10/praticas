import java.util.Scanner;

public class AvaliaçãoDeNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a nota do aluno: ");
        int nota = scanner.nextInt();

        if (nota >= 0 && nota <= 100) {
            switch (nota) {
                case 10:
                    System.out.println("excelente");
                    break;
                case 9:
                    System.out.println("excelente");
                    break;
                case 8:
                    System.out.println("muito bom");
                    break;
                case 7:
                    System.out.println("bom!");
                    break;
                case 6:
                    System.out.println("regular.");
                    break;
                default:
                    System.out.println("precisa melhorar.");

            }
        } else {
            System.out.println("nota invalida");

        }
        scanner.close();

    }
}

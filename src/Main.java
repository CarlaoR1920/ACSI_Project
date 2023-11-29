import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Comprar bilhete");
            System.out.println("2. Resgatar oferta");
            System.out.println("3. Visualizar histórico de vigens");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (escolha) {
                case 1:
                    System.out.println("Você comprou bilhetinho!");
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2.");
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3.");
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 0);

        scanner.close();
    }
}

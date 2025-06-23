import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        MoedaService service = new MoedaService();


        while (true) {
            menu.exibirMenu();
            String opcao = scanner.nextLine();

            if (opcao.equals("7")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            String[] moedas = menu.getMoedas(opcao);
            if (moedas == null) {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.print("Digite o valor para converter: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir \n

            double convertido = service.converterMoeda(moedas[0], moedas[1], valor);
            System.out.printf("Valor convertido: %.2f %s%n", convertido, moedas[1]);
        }
    }
}

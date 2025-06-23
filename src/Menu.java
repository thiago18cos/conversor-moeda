public class Menu {
    public void exibirMenu() {
        System.out.println("**********************************************");
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileiro");
        System.out.println("4) Real brasileiro => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Sair");
        System.out.println("Escolha uma opção válida:");
        System.out.println("**********************************************");
    }

    public String[] getMoedas(String opcao) {
        return switch (opcao) {
            case "1" -> new String[]{"USD", "ARS"};
            case "2" -> new String[]{"ARS", "USD"};
            case "3" -> new String[]{"USD", "BRL"};
            case "4" -> new String[]{"BRL", "USD"};
            case "5" -> new String[]{"USD", "COP"};
            case "6" -> new String[]{"COP", "USD"};
            default -> null;
        };
    }
}


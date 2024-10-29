import java.util.Scanner;


import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== Calculadora do PasiNho ===");

        while (continuar) {
            mostrarMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarOperacao(scanner, "soma");
                    break;
                case 2:
                    realizarOperacao(scanner, "subtracao");
                    break;
                case 3:
                    realizarOperacao(scanner, "multiplicacao");
                    break;
                case 4:
                    realizarOperacao(scanner, "divisao");
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo da calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    //Método para exibir o menu
    public static void mostrarMenu() {
        System.out.println("\nEscolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    // Método para realizar operações básicas
    public static void realizarOperacao(Scanner scanner, String operacao) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case "soma":
                resultado = num1 + num2;
                break;
            case "subtracao":
                resultado = num1 - num2;
                break;
            case "multiplicacao":
                resultado = num1 * num2;
                break;
            case "divisao":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }
    }

    }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado = 0;
        float resto;
        int escolha;
        String continuar;

        while (true) {
            System.out.println("\n-------Calculadora Interativa-------");
            System.out.println("Resultado Atual: " + resultado); // Mostra o valor acumulado
            System.out.println("1-Soma");
            System.out.println("2-Subtração");
            System.out.println("3-Multiplicação");
            System.out.println("4-Divisão");
            System.out.println("5-Potência");
            System.out.println("6-SAIR");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 6) {
                System.out.println("Calculadora encerrada.");
                break;
            }

            if (escolha == 1) {
                System.out.print("Escreva o primeiro número da soma: ");
                n1 = scanner.nextDouble();
                System.out.print("Escreva o segundo número da soma: ");
                n2 = scanner.nextDouble();
                resultado = n1 + n2;
                System.out.println("\nSeu resultado é: " + resultado);

                int continuaaa = 1;
                while (continuaaa == 1) {
                    System.out.println("\nO que deseja fazer agora?");
                    System.out.println("a - Continuar acumulando somas");
                    System.out.println("b - Voltar ao menu com o resultado ZERADO");
                    System.out.print("Sua escolha: ");
                    continuar = scanner.next();
                    if (continuar.equalsIgnoreCase("a")) {
                        System.out.print("Escreva o acréscimo da soma: ");
                        n2 = scanner.nextDouble();
                        resultado = resultado + n2;
                        System.out.println("\nSeu resultado acumulado é: " + resultado);
                    }
                    else if (continuar.equalsIgnoreCase("b")) {
                        resultado = 0;
                        System.out.println("Resultado zerado com sucesso!");
                        continuaaa = 0;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
            }

            else if (escolha == 2) {
                System.out.print("Escreva o primeiro número da subtração: ");
                n1 = scanner.nextDouble();
                System.out.print("Escreva o segundo número da subtração: ");
                n2 = scanner.nextDouble();
                resultado = n1 - n2;
                System.out.println("\nSeu resultado é: " + resultado);

                int continuaaa = 1;
                while (continuaaa == 1) {
                    System.out.println("\nO que deseja fazer agora?");
                    System.out.println("a - Continuar subtraindo");
                    System.out.println("b - Voltar ao menu com o resultado ZERADO");
                    System.out.print("Sua escolha: ");
                    continuar = scanner.next();
                    if (continuar.equalsIgnoreCase("a")) {
                        System.out.print("Escreva a redução da subtração: ");
                        n2 = scanner.nextDouble();
                        resultado = resultado - n2;
                        System.out.println("\nSeu resultado subtraido é: " + resultado);
                    }
                    else if (continuar.equalsIgnoreCase("b")) {
                        resultado = 0;
                        System.out.println("Resultado zerado com sucesso!");
                        continuaaa = 0;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
            }

            else if (escolha == 3) {
                System.out.print("Escreva o primeiro número da multiplicação: ");
                n1 = scanner.nextDouble();
                System.out.print("Escreva o segundo número da multiplicação: ");
                n2 = scanner.nextDouble();
                resultado = n1 * n2;
                System.out.println("\nSeu resultado é: " + resultado);
            }

            else if (escolha == 4) {
                System.out.print("Escreva o primeiro número da divisão: ");
                n1 = scanner.nextDouble();
                System.out.print("Escreva o segundo número da divisão: ");
                n2 = scanner.nextDouble();
                while (n2 == 0) {
                    System.out.print("Você não pode dividir por zero. Digite outro número: ");
                    n2 = scanner.nextDouble();
                }
                resultado = n1 / n2;
                resto = (float) (n1 % n2);
                System.out.println("\nSeu resultado é: " + resultado + " e o resto é: " + resto);
            }

            else if (escolha == 5) {
                System.out.print("Escreva a base da potência: ");
                n1 = scanner.nextDouble();
                System.out.print("Escreva o expoente da potência: ");
                n2 = scanner.nextDouble();
                resultado = Math.pow(n1, n2);
                System.out.println("\nSeu resultado é: " + resultado);
            }

            else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}

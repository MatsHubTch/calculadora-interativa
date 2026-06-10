import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado = 0;
        float resto;
        int escolha;
        String continuar;

        while (true) {
            System.out.println("-------Calculadora Interativa-------");
            System.out.println("\n1-Soma");
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
                System.out.print("escreva o primeiro número da soma: ");
                n1 = scanner.nextDouble();
                System.out.print("escreva o segundo número da soma: ");
                n2 = scanner.nextDouble();
                resultado = resultado + n1 + n2;
                System.out.println("\nseu resultado é: " + resultado);
            }

            else if (escolha == 2) {
                System.out.print("escreva o primeiro número da subtração: ");
                n1 = scanner.nextDouble();
                System.out.print("escreva o segundo número da subtração: ");
                n2 = scanner.nextDouble();
                resultado = resultado + n1 - n2;
                System.out.println("\nseu resultado é: " + resultado);
            }

            else if (escolha == 3) {
                System.out.print("escreva o primeiro número da multiplicação: ");
                n1 = scanner.nextDouble();
                System.out.print("escreva o segundo número da multiplicação: ");
                n2 = scanner.nextDouble();
                resultado = resultado + (n1 * n2);
                System.out.println("\nseu resultado é: " + resultado);
            }

            else if (escolha == 4) {
                System.out.print("escreva o primeiro número da divisão: ");
                n1 = scanner.nextDouble();
                System.out.print("escreva o segundo número da divisão: ");
                n2 = scanner.nextDouble();
                while(n2 <= 0) {
                    System.out.print("você não pode usar um número menor ou igual a zero.\n");
                    n2 = scanner.nextDouble();
                }
                resultado = resultado + (n1 / n2);
                resto = (float) (n1 % n2);
                System.out.println("\nseu resultado é: " + resultado + " e o resto é: " + resto);
            }

            else if (escolha == 5) {
                System.out.print("escreva a base da potência: ");
                n1 = scanner.nextDouble();
                System.out.print("escreva o expoente da potência: ");
                n2 = scanner.nextDouble();
                resultado = resultado + Math.pow(n1, n2);
                System.out.println("\nseu resultado é: " + resultado);
            }

            System.out.println("\nResultado:" + resultado);
            System.out.println("O que deseja fazer agora?");
            System.out.println("a - Continuar acumulando as contas");
            System.out.println("b - Voltar ao menu com o resultado ZERADO");
            System.out.print("Sua escolha: ");
            continuar = scanner.next();

            if (continuar.equals("b")) {
                resultado = 0;
                System.out.println("Resultado zerado com sucesso!");
            }

        }

        scanner.close();
    }
}

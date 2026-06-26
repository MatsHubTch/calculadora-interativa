import java.util.Scanner;

public class Main2 {

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }
    public static double Subtração(double n1, double n2) {
        return n1 - n2;
    }
    public static double Multiplicação(double n1, double n2) {
        return n1 * n2;
    }
    public static double Divisão(double n1, double n2) {
        return n1 / n2;
    }
    public static double Potência(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado = 0;
        float resto;
        int escolha;
        String op = "";
        String continuar;

        while (true) {
            System.out.println("\n-------Calculadora Interativa-------");
            System.out.println("Resultado Atual: " + resultado + "\n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão \n5-Potência \n6-SAIR \nEscolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 6) {
                System.out.println("Calculadora encerrada.");
                break;
            }

            if (escolha < 1 || escolha > 6) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            if (escolha == 1) { op = "Soma"; }
            else if (escolha == 2) { op = "Subtração"; }
            else if (escolha == 3) { op = "Multiplicação"; }
            else if (escolha == 4) { op = "Divisão"; }
            else if (escolha == 5) { op = "Potência"; }

            System.out.println("Escreva os números da " + op + ":");
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();

            if (escolha == 1) {
                resultado = somar(n1, n2);
                System.out.println("\nSeu resultado é: " + resultado);
                while (true) {
                    System.out.println("\n[A] Acumular Soma | [B] Acumular Subtração | [C] Zerar e Voltar");
                    System.out.print("Escolha: ");
                    continuar = scanner.next();
                    if (continuar.equalsIgnoreCase("c")) {
                        resultado = 0;
                        break;
                    }
                    System.out.print("Digite o próximo número: ");
                    double proximoNum = scanner.nextDouble();
                    if (continuar.equalsIgnoreCase("a")) {
                        resultado = somar(resultado, proximoNum);
                    } else if (continuar.equalsIgnoreCase("b")) {
                        resultado = Subtração(resultado, proximoNum); // Ajustado para usar a função
                    } else {
                        System.out.println("Opção inválida!");
                        continue;
                    }
                    System.out.println("\nSeu resultado atualizado é: " + resultado);
                }
            }

            else if (escolha == 2) {
                resultado = Subtração(n1, n2);
                System.out.println("\nSeu resultado é: " + resultado);
                while (true) {
                    System.out.println("\n[A] Acumular Subtração | [B] Acumular Soma | [C] Zerar e Voltar");
                    System.out.print("Escolha: ");
                    continuar = scanner.next();
                    if (continuar.equalsIgnoreCase("c")) {
                        resultado = 0;
                        System.out.println("Resultado zerado com sucesso!");
                        break;
                    }
                    System.out.print("Digite o próximo número: ");
                    double proximoNum = scanner.nextDouble();
                    if (continuar.equalsIgnoreCase("a")) {
                        resultado = Subtração(resultado, proximoNum);
                    } else if (continuar.equalsIgnoreCase("b")) {
                        resultado = somar(resultado, proximoNum);
                    } else {
                        System.out.println("Opção inválida!");
                        continue;
                    }
                    System.out.println("\nSeu resultado atualizado é: " + resultado);
                }
            }

            else if (escolha == 3) {
                resultado = Multiplicação(n1, n2);
                System.out.println("\nSeu resultado é: " + resultado);
            }

            else if (escolha == 4) {
                while (n2 == 0) {
                    System.out.print("Você não pode dividir por zero. Digite o segundo número novamente: ");
                    n2 = scanner.nextDouble();
                }
                resultado = Divisão(n1, n2);
                resto = (float) (n1 % n2);
                System.out.println("\nSeu resultado é: " + resultado + " e o resto é: " + resto);
            }

            else if (escolha == 5) {
                resultado = Potência(n1, n2);
                System.out.println("\nSeu resultado é: " + resultado);
            }
        }

        scanner.close();
    }
}

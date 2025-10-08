import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nomeUser, senhaUser;
        double saldo = 0.0;
        char opcao;
        String menuDeOpcoes = """
                Nos diga o que você deseja fazer:
                (D) Depositar
                (E) Extrato
                (S) Sacar
                (X) Sair
                """;
        int numConta;

        // Cadastro inicial
        System.out.println("Vamos abrir sua conta. Digite seu nome:");
        nomeUser = input.nextLine();

        System.out.println("Qual tipo de conta? Digite C para corrente ou P para poupança:");
        char tipoConta = Character.toUpperCase(input.next().charAt(0));
        input.nextLine(); // limpa o buffer

        numConta = new Random().nextInt(5000);
        System.out.println("Olá " + nomeUser + ", sua conta é " + numConta + ".");

        System.out.println("Agora cadastre uma senha:");
        senhaUser = input.nextLine();

        System.out.println("Deseja acessar sua conta ou sair do app? Digite A para acessar ou S para sair:");
        char acessarConta = Character.toUpperCase(input.next().charAt(0));
        input.nextLine(); // limpa buffer

        if (acessarConta == 'A') {
            System.out.println("Digite sua senha para acessar:");
            String tentativaDeSenha = input.nextLine();

            if (senhaUser.equals(tentativaDeSenha)) {
                System.out.println(menuDeOpcoes);
                opcao = Character.toUpperCase(input.next().charAt(0));
                input.nextLine();

                while (opcao != 'X') {
                    switch (opcao) {
                        case 'D': // DEPÓSITO
                            System.out.print("Digite sua senha novamente: ");
                            tentativaDeSenha = input.nextLine();

                            if (senhaUser.equals(tentativaDeSenha)) {
                                System.out.printf("Olá %s, seu saldo atual é R$ %.2f.%n", nomeUser, saldo);
                                System.out.print("Quanto deseja depositar? ");
                                saldo += input.nextDouble();
                                input.nextLine(); // limpa buffer
                                System.out.println("Depósito realizado com sucesso!");
                            } else {
                                System.out.println("Senha incorreta!");
                            }
                            break;

                        case 'E': // EXTRATO
                            System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                            break;

                        case 'S': // SAQUE
                            if (saldo <= 0.0) {
                                System.out.println("Você não possui fundos suficientes para sacar.");
                            } else {
                                System.out.printf("Seu saldo é R$ %.2f. Quanto deseja sacar? ", saldo);
                                double valorSaque = input.nextDouble();
                                input.nextLine();
                                if (valorSaque > saldo) {
                                    System.out.println("Valor de saque maior que o saldo disponível!");
                                } else {
                                    saldo -= valorSaque;
                                    System.out.println("Saque realizado com sucesso!");
                                }
                            }
                            break;

                        default:
                            System.out.println("Opção inválida!");
                    }

                    System.out.println("\n" + menuDeOpcoes);
                    opcao = Character.toUpperCase(input.next().charAt(0));
                    input.nextLine();
                }

                System.out.println("Você escolheu sair. Até logo, " + nomeUser + "!");

            } else {
                System.out.println("Senha incorreta. Acesso negado.");
            }
        } else {
            System.out.println("Encerrando o aplicativo...");
        }

        input.close();
    }
}

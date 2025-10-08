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
        System.out.println("Vamos abrir sua conta Digite seu Nome:");
        nomeUser = input.nextLine();
        System.out.println("Qual tipo de conta? Digite C para corrente ou P para poupança");
        char tipoConta = input.next().charAt(0);
        numConta = new Random().nextInt(5000);
        System.out.println("Olá " + nomeUser + " sua conta é " + numConta);
        System.out.println("Agora cadastre uma senha ");
        input.nextLine();
        senhaUser = input.nextLine();
        System.out.println("Deseja acessar sua conta ou sair do app? digite A para acessar ou S para sair");
        char acessarConta = input.next().charAt(0);
        if (acessarConta == 'A') {
            System.out.println("Para continuar digite sua senha");
            input.nextLine();
            String tentativaDeSenha = input.nextLine();
            if ( senhaUser.equals(tentativaDeSenha)) {
                System.out.println(menuDeOpcoes);
                opcao = input.next().charAt(0);
                while (opcao != 'X') {
                    switch (opcao) {
                        case 'D':
                            System.out.println("Para continuar digite sua senha");
                            tentativaDeSenha = input.nextLine();
                            if ( senhaUser.equals(tentativaDeSenha)) {
                                System.out.println("Olá " + nomeUser + " seu saldo atual é de: " + saldo + "quanto deseja depositar?");
                                saldo = saldo + input.nextDouble();
                                System.out.println("Operação efetuada com sucesso.\n" + menuDeOpcoes);
                                opcao = input.next().charAt(0);
                            }

                            break;
                        case 'E':
                            System.out.println("Olá " + nomeUser + " seu saldo atual é de: " + saldo);
                            System.out.println("Operação efetuada com sucesso.\n " + menuDeOpcoes);
                            opcao = input.next().charAt(0);
                            ;
                            break;
                        case 'S':
                            if (saldo <= 0.0) {
                                System.out.println("Você não possui fundos suficientes para executar essa operação\n" + menuDeOpcoes);
                            }
                            System.out.println("Olá " + nomeUser + " seu saldo atual é de: " + saldo + "quanto deseja sacar");
                            saldo = saldo - input.nextDouble();
                            System.out.println("Operação efetuada com sucesso.\n" + menuDeOpcoes);
                            opcao = input.next().charAt(0);
                            ;
                            break;
                        case 'X':
                            System.out.println("Você escolheu sair, até logo.");
                            break;
                        default:

                            System.out.println("OPÇÃO INVALIDA \n" + menuDeOpcoes);
                            opcao = input.next().charAt(0);
                            ;

                    }
                }

            }
        } else {

        }


    }
}

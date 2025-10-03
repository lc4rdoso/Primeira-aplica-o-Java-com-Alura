import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String nomeUser, senhaUser;
        String menuDeOpcoes = """
                Olá, nos diga o que você deseja fazer:
                (D) Depositar
                (E) Extrato
                (S) Sacar
                """;
        int numConta;
        System.out.println("Vamos abrir sua conta Digite seu Nome:");
        nomeUser= input.nextLine();
        System.out.println("Qual tipo de conta? Digite C para corrente ou P para poupança");
        char tipoConta = input.next().charAt(0);
        numConta = new Random().nextInt(5000);
        System.out.println("Olá " + nomeUser + " sua conta é "+ numConta);
        System.out.println("Deseja acessar sua conta ou sair do app? digite A para acessar ou S para sair");
        char acessarConta = input.next().charAt(0);
        if (acessarConta =='A'){
            switch (tipoConta) {
                case 'C':

                    break;
                case 'P':
                    break;
            }
        }else {
            System.out.println("Você escolheu sair, até logo.");
        }





    }
}

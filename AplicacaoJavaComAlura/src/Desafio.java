import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String nomeUser, senhaUser, tipoDaConta;
        int numConta;
        System.out.println("Vamos abrir sua conta Digite seu Nome:");
        nomeUser= input.nextLine();
        System.out.println();
        numConta = new Random().nextInt(5000);

    }
}

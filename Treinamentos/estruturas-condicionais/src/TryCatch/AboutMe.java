package TryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        try {
            //Criando o objeto Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //Imprimindo os dados na tela
            System.out.println("=================================");
            System.out.println("Ola, me chamo " + nome.toUpperCase()  + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "cm.");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Os campos idade e altura precisam ser númericos");
        }
    }
}

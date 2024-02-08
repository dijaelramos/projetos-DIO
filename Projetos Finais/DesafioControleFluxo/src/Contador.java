import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Recebendo os parâmetros por Scanner
        Scanner parametros = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int parametroUm = parametros.nextInt();

        System.out.println("Digite o segundo numero: ");
        int parametroDois = parametros.nextInt();

//        int parametroUm = 20;
//        int parametroDois = 2;

        try {
            //Chamando o método da contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        parametros.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException  {
        if (parametroUm < parametroDois) {
            int contagem = parametroDois - parametroUm + 1; // Adiciona 1 para incluir o último número
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
            System.out.println("Quantidade de números no intervalo: " + contagem);
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}

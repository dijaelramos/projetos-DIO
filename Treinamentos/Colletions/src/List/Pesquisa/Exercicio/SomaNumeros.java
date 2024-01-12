package List.Pesquisa.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int totalSoma = 0;
        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                totalSoma += n;
            }
        }
        return totalSoma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                if (n >= maiorNumero) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                if (n < menorNumero)
                    menorNumero = n;
            }
        }
        return menorNumero;
    }
    public void exibirNumeros(){
        System.out.println("Quantidade de numeros é: " + numerosList);
    }
    public static void main(String[] args) {
        SomaNumeros s = new SomaNumeros();

        // Adicionando números à lista
        s.adicionarNumero(5);
        s.adicionarNumero(0);
        s.adicionarNumero(1);
        s.adicionarNumero(-8);
        s.adicionarNumero(10);

        System.out.println("Números adicionados:");
        s.exibirNumeros();

        System.out.println("Soma dos números = " + s.calcularSoma());

        System.out.println("Maior número = " + s.encontrarMaiorNumero());

        System.out.println("Menor número = " + s.encontrarMenorNumero());
    }
}

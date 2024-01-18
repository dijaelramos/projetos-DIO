package Map.Pesquisa.Exercicio;

import Map.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            System.out.println("Lista de palavras vazia!");
        }
    }
    public int exibirContagemPalavras() {
        int contagemPalavras = 0;
        if (!palavrasMap.isEmpty()) {
            for (int p : palavrasMap.values()) {
                contagemPalavras += p;
            }
        }
        return contagemPalavras;
    }
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int contagem = 0;
        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> p : palavrasMap.entrySet()) {
                if (p.getValue() > contagem) {
                    contagem = p.getValue();
                    palavraMaisFrequente = p.getKey();
                }
            }
        } else {
            System.out.println("Nenhuma palavra na lista");
        }
        return palavraMaisFrequente;
    }
    public static void main(String[] args) {
        ContagemPalavras c = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        c.adicionarPalavra("Java", 2);
        c.adicionarPalavra("Python", 8);
        c.adicionarPalavra("JavaScript", 1);
        c.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + c.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = c.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }

}

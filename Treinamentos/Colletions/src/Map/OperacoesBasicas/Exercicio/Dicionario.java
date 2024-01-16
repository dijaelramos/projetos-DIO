package Map.OperacoesBasicas.Exercicio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }
    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra) {
        String pesquisarNome = null;
        if (!dicionarioMap.isEmpty()) {
            pesquisarNome = dicionarioMap.get(palavra);
        }
        return pesquisarNome;
    }
    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        d.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        d.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        d.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        d.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = d.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = d.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        d.removerPalavra("typescript");
        d.exibirPalavras();
    }
}

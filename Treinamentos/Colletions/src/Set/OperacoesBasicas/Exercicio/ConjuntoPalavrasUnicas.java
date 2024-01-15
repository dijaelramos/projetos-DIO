package Set.OperacoesBasicas.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra) {
        this.palavrasSet.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (!palavrasSet.isEmpty())
                if (palavrasSet.contains(palavra))
                    palavrasSet.remove(palavra);
    }
    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }
    public void exibirPalavrasUnicas() {
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        }
    }
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas p = new ConjuntoPalavrasUnicas();

        p.adicionarPalavra("Java");
        p.adicionarPalavra("Python");
        p.adicionarPalavra("JavaScript");
        p.adicionarPalavra("Python");
        p.adicionarPalavra("C++");
        p.adicionarPalavra("Ruby");

        p.exibirPalavrasUnicas();

        p.removerPalavra("Python");
        p.exibirPalavrasUnicas();

        p.removerPalavra("Swift");

        System.out.println("A linguagem 'Java' está no conjunto? " + p.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + p.verificarPalavra("Python"));

        p.exibirPalavrasUnicas();
    }

}
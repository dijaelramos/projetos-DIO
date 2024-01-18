package Map.Ordenacao.Exercicio;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> livroRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> l : livrosMap.entrySet()) {
            if (l.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livroRemover.add(l.getKey());
            }
        }
        for (String livro : livroRemover) {
            livrosMap.remove(livro);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new Livro.ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorAutor, new Livro.ComparatorPorAutor());
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrosMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livrosMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline l = new LivrariaOnline();
        // Adiciona os livros à livraria online
        l.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        l.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        l.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        l.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        l.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        l.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + l.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + l.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor ===================================
        String autorPesquisa = "Josh Malerman";
        System.out.println("Pesquisa de livro por autor: \n" + l.pesquisarLivrosPorAutor(autorPesquisa));


        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: \n" + l.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: \n" + l.obterLivroMaisBarato());

        // Remover um livro pelo título
        System.out.println("Lista após exclulsão de livros:");
        l.removerLivro("1984");
        System.out.println(l.livrosMap);

    }
}

package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos.produtoSet);

        cadastroProdutos.adicionarProduto(1L, "Produto 3", 150d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 25d, 15);
        cadastroProdutos.adicionarProduto(3L, "Produto 4", 35d, 51);
        cadastroProdutos.adicionarProduto(4L, "Produto 1", 45d, 40);
        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

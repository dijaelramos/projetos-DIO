package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public  void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
    }
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produtos p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } return valorTotalEstoque;
    }
    public Produtos obterProdutoMaisCaro() {
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produtos p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        } return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 2, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 3, 20.0);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 1, 50.0);
        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

    }
}

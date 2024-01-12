package List.OperacoresBasicas.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        }
    }
    public double calcularValorTotal() {
        double valorTotalCarrinho = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getQuantidade() * i.getPreco();
                valorTotalCarrinho += valorItem;
            }
        }
        return valorTotalCarrinho;
    }
    public void exibirItens() {
        if (!itemList.isEmpty())
            System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.exibirItens();
        c.adicionarItem("Produto 1", 2.0d, 10);
        c.adicionarItem("Produto 2", 10.0d, 3);
        c.adicionarItem("Produto 3", 20.0d, 2);
        c.adicionarItem("Produto 4", 30.0d, 1);
        c.exibirItens();

        System.out.println("O valor total do carrinho é de: R$ " + c.calcularValorTotal());
        c.removerItem("Produto 2");
        c.exibirItens();
        System.out.println("O valor total do carrinho é de: R$ " + c.calcularValorTotal());
    }
}
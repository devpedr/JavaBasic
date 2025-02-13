package src.exercice.OperacoesBasicas;

import java.util.*;

public class CarrinhoDeCompras {
    // atributo

    private List<Item> itemList; // Criando lista com os atributos da classe "Item"

    public CarrinhoDeCompras() { // Construtor, sempre que for criado um objeto com "CarrinhosDeCompras, será criado um ArrayList vázio"
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) { //Metodo de adicionar item na lista, com os atributos da class Item
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> ItemParaRemover = new ArrayList<>(); // Criação da lista para remover
        for (Item item : itemList) { // Pecorre sobre iTemList
            if (item.getNome().equals(nome)) { // Verifica se o nome do item coincide
                ItemParaRemover.add(item); // Adiciona o item à lista de remoção
            }
        }
        itemList.removeAll(ItemParaRemover); // Remove todos os itens encontrados
    }

    public double calcularValorTotal() {
        double total = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                total += valorItem;
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vázia!");
        }

    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vázia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
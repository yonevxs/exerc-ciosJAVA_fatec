package br.edu.fatecpg.sistema_inventario.model;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(){

    }
    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal(){
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString(){
        return String.format(" - %s (Qtd: %d, Subtotal: R$%.2f)", produto.getNome(), quantidade, getSubtotal());
    }
}

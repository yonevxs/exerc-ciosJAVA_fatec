package br.edu.fatecpg.model;

public class Produto {
	private String nProduto;
	private double prProduto;
	private int estoque;
	
	public Produto(String nProduto) {
		this.nProduto = nProduto;
	}
	public Produto(String nProduto, double prProduto) {
		this.nProduto = nProduto;
		this.prProduto = prProduto;
	}
	public Produto(String nProduto, double prProduto, int estoque) {
		this.nProduto = nProduto;
		this.prProduto = prProduto;
		this.estoque = estoque;
	}
	public String getProduto() {
		return nProduto;
	}
	public void setProduto(String nProduto) {
		this.nProduto = nProduto;
	}
	
	public double getprProduto() {
		return prProduto;
	}
	public void setprProduto(double prProduto) {
		this.prProduto = prProduto;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}

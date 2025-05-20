package br.edu.fatecpg.model;

public class Vendedor implements Funcionario {
	@Override
	public void baterPonto() {
		System.out.println("Ponto batido pelo vendedor");
	}
	
	@Override
	public void solicitarMaterial() {
		System.out.println("Material solicitado pelo vendedor");
	}
	
	@Override
	public void fecharCaixa() {
		System.out.println("Vendedor não fecha caixa!");
	}
	
	@Override
	public void realizarVenda() {
		System.out.println("Venda realizada!");
	}

}

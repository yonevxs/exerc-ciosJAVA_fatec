package br.edu.fatecpg.model;

public class Gerente implements Funcionario{
	
	public void solicitarMaterial() {
		System.out.println("Material solicitado pelo gerente");
	}
	
	public void baterPonto() {
		System.out.println("Gerente não bate ponto!");
	}

	@Override
	public void fecharCaixa() {
		System.out.println("Caixa fechado pelo gerente!");
		
	}

	@Override
	public void realizarVenda() {
		System.out.println("Gerente não realiza venda!");
		
	}
	
}
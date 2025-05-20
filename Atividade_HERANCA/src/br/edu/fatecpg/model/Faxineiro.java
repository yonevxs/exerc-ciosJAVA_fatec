package br.edu.fatecpg.model;

public class Faxineiro implements Funcionario{

	@Override
	public void baterPonto() {
		System.out.println("Ponto batido pelo faxineiro!");
	}

	@Override
	public void solicitarMaterial() {
		System.out.println("Faxineiro não solicita material!");
	}

	@Override
	public void fecharCaixa() {
		System.out.println("Faxineiro não fecha caixa!");
		
	}

	@Override
	public void realizarVenda() {
		System.out.println("Faxineiro não realiza venda!");
		
	}
}
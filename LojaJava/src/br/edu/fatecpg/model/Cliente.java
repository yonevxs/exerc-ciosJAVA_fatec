package br.edu.fatecpg.model;

public class Cliente extends Pessoa {
	private int codigo;
	private double credito;
	private Endereco end; //Associação

	public Cliente(String nome, int id, int cd, double crd, Endereco end){
		super(nome, id);
		this.codigo = cd;
		this.credito = crd;
		this.end = end;
	}

	
	
	@Override
	public String toString() {
		return "Cliente [Nome = " + this.getNome() + " , idade" + this.getIdade() +
				", codigo=" + codigo + ", credito=" + credito + ", end=" + end + "]";
	}
	
}





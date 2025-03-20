package br.edu.fatecpg.abstracao.model;
//Classe
public class Carro {
	public String marca;//Atributo
	public String modelo;//Atributo
	public int ano;//Atributo
	public boolean ligado;
	public int velocidade;
	
	//Método
	public void ligar() {
		System.out.println("Carro Ligando...");
		System.out.println("Carro Ligado!");
		
		this.ligado = true;
	}
	//Método
	public void acelerar() {
		if(ligado) {
			if(this.velocidade >= 160) {
				System.out.println("Atingiu o limite de velocidade!");
			} else {
				this.velocidade+= 20;
				System.out.println("A velocidade atual: " + velocidade + "km/h");					
			}
		}
		else {
			System.out.println("O carro está desligado!");
		}
	}
	public void frear() {
		if(this.velocidade <= 0) {
			System.out.println("O carro já está parado");
			this.velocidade = 0;
		}
		else {
			if(this.velocidade < 30) {
				this.velocidade = 0;
				System.out.println("O carro parou.");
			}
			else {				
				this.velocidade -=30;
				System.out.println("A velociade atual é: " + velocidade + "Km/h");			
			}
		}
	}
	public void desligar() {
		System.out.println("Desligou!");
		this.ligado = false;
	}
}

package br.edu.fatecpg.abstracao.model;
//Classe
public class Carro {
	public String marca;//Atributo
	public String modelo;//Atributo
	public int ano;//Atributo
	public boolean ligado;
	public int velocidade = 0;
	public double capacidadeTanque;
	
    public Carro(String marca, String modelo, int ano, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
	
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
	
	public void 
}
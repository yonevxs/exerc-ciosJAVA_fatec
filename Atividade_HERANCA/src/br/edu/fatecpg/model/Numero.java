package br.edu.fatecpg.model;

public class Numero implements OperacoesMatematicas {
	private double a;
	private double b;
	
	public Numero(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getValorA() {
		return a;
	}
	public void setValorA(double a) {
		this.a = a;
	}
	
	public double getValorB() {
		return b;
	}
	public void setValorB(double b) {
		this.b = b;
	}
	
	private String formatDouble(double valor) {
		if(valor == (int)valor) {
			return String.valueOf((int)valor);
		}else {
			return String.format("%.2f", valor);
		}
	}
	
	@Override
	public void soma() {
		System.out.println("Soma: " + formatDouble(a + b));
	}
	@Override
	public void subtracao() {
		System.out.println("Subtração: " + formatDouble(a - b));
	}
	@Override
	public void multiplicacao() {
		System.out.println("Multiplicação: " + formatDouble(a * b));
	}
	@Override
	public void divisao() {
		if(a == 0 || b == 0) {
			System.out.println("Não é possível realizar a divisão");
		}else {			
			System.out.println("Divisão: " + formatDouble(a / b));
		}
	}
	

}

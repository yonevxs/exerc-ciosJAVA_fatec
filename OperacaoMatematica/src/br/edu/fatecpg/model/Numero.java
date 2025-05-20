package br.edu.fatecpg.model;

public class Numero implements OperacoesMatematicas {
	private int a;
	private int b;
	
	public Numero(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getValorA() {
		return a;
	}
	public void setValorA(int a) {
		this.a = a;
	}
	
	public int getValorB() {
		return b;
	}
	public void setValorB(int b) {
		this.b = b;
	}
	
	@Override
	public void soma() {
		System.out.println("Soma: " + (a + b));
	}
	@Override
	public void subtracao() {
		System.out.println("Subtração: " + (a - b));
	}
	@Override
	public void multiplicacao() {
		System.out.println("Multiplicação: " + (a * b));
	}
	@Override
	public void divisao() {
		if(a == 0 || b == 0) {
			System.out.println("Não é possível realizar a divisão");
		}else {			
			System.out.println("Divisão: " + (a / b));
		}
	}
	

}

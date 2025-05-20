package br.edu.fatecpg.model;

public class PagamentoDinheiro implements Pagamento{
	private float pagamento;
	private float dc = 10;
	private float pagamento_dc;
	
	public PagamentoDinheiro(float pagamento) {
		this.pagamento = pagamento;
	}
	
	public float getPagamentoCartao() {
		return pagamento;
	}
	public void setPagamentoCartao(float pagamento) {
		this.pagamento = pagamento;
	}
	private String formatDouble(double valor) {
		if(valor == (int)valor) {
			return String.valueOf((int)valor);
		}else {
			return String.format("%2f", valor);
		}
	}
	
	@Override
	public void calcularPagamento(){
		this.pagamento_dc = pagamento - ((pagamento * this.dc)/ pagamento);
		System.out.println("Valor a ser pago: R$" + formatDouble(this.pagamento));
		System.out.println("Valor a ser pago: R$" + formatDouble(this.pagamento_dc) + " com desconto de 10%");
	}
	@Override
	public void emitirRecibo() {
		System.out.println("");
		System.out.println("FATEC SHOP");
		System.out.println("Cliente: ");
		System.out.println("--------------------------------------------");
		System.out.println("Descrição / Quantidade X Unitário      Total");
		System.out.println("--------------------------------------------");
		System.out.println("Computador Pichau Gamer RTX5060       R$" + formatDouble(this.pagamento));
		System.out.println("--------------------------------------------");
		System.out.println("Total Produtos                        R$" + formatDouble(this.pagamento));
		System.out.println("Taxa/Desconto                         R$" + formatDouble(this.dc));
		System.out.println("Total a Pagar                         R$" + formatDouble(this.pagamento_dc));
	}
}

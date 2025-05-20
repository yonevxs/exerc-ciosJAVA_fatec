package br.edu.fatecpg.model;

public class PagamentoCartao extends Pagamento{
	@Override
	public String processarPagamento() {
		return "Processando pagamento via cartão de crédito...";
	}
}

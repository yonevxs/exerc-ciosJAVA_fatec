package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {
	public static void main(String[] args) {
		//Numero n = new Numero(10.2, 5.6);
		
		//n.soma();
		//n.divisao();
		//n.subtracao();
		//n.multiplicacao();
		
		//PagamentoCartao pc = new PagamentoCartao(100);
		//PagamentoDinheiro pd = new PagamentoDinheiro(100);
		
		//pc.calcularPagamento();
		//pc.emitirRecibo();
		//pd.calcularPagamento();
		///pd.emitirRecibo();
		
		SistemaDeSeguranca p = new SistemaDeSeguranca("guest", "guest");
		p.login("ignorar", "ignorar");
		if(p.estaLogado()) {
			System.out.println("Usuario logado: " + p.getUsuario());
		}
		p.logout();
		if(!p.estaLogado()) {
			System.out.println("Usuario deslogado. Autenticado: " + p.estaAutenticado());
		}
	}

}

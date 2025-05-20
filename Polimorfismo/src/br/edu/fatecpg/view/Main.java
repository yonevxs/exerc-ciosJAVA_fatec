package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {

	public static void main(String[] args) {
		//1. Sobrescrita de métodos em uma hierarquia de veículos
		Carro carro = new Carro();
		System.out.println(carro.mover());
		
		Bicicleta bike = new Bicicleta();
		System.out.println(bike.mover());
		System.out.println("-----------------------------------");
		
		//2. Sobrecarga de métodos
		Calculadora calc = new Calculadora();
		System.out.println(calc.somar(2, 5));
		System.out.println(calc.somar(5, 6, 7));
		System.out.println(calc.somar(2.5, 7.3));
		System.out.println("-----------------------------------");
		
		//3. Sobrecarga de construtores
		Produto p = new Produto("Pen-Drive");
		System.out.println(p.getProduto());
		
		Produto c = new Produto("Placa de vídeo", 1500);
		System.out.println(c.getProduto() + ", " + c.getprProduto());
		
		Produto d = new Produto("Placa-Mãe", 1395, 10);
		System.out.println(d.getProduto() + ", " + d.getprProduto() + ", " + d.getEstoque());
		
		System.out.println("-----------------------------------");
		
		//4. Sobrescrita de métodos em uma classe de pagamento
		PagamentoCartao cartao = new PagamentoCartao();
		System.out.println(cartao.processarPagamento());
		
		PagamentoBoleto boleto = new PagamentoBoleto();
		System.out.println(boleto.processarPagamento());
		
		System.out.println("-----------------------------------");
		
		//5. Sobrecarga de métodos em uma classe de conversão
		Conversor conv = new Conversor();
		System.out.println(conv.converter(32));
		System.out.println(conv.converter(5.2));
		System.out.println(conv.converter("Java é a parada do momento!"));
	}
}

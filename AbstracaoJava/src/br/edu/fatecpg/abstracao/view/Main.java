package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Carro;
import br.edu.fatecpg.abstracao.model.ContaBancaria;
import br.edu.fatecpg.abstracao.model.Produto;

public class Main {

	public static void main(String[] args) {
		// Testando a classe Carro
		
		/*
        Carro carro = new Carro("Toyota", "Corolla", 2022, 60.0);
        
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Capacidade do tanque: " + carro.getCapacidadeTanque() + " litros");
        
        double precoGasolina = 5.00;
        System.out.println("O custo para encher o tanque é: R$ " + carro.calcularCustoParaEncherTanque(precoGasolina));
    	*/
		
		// Testando a classe Conta Bancária
		
		/*
		ContaBancaria conta = new ContaBancaria(1234, 56789, "João Silva");
        
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getConta());
        System.out.println("Titular: " + conta.getNomeCliente());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        System.out.println("Cheque Especial disponível: R$ " + conta.getChequeEspecial());
        
        conta.depositar(1000);
        conta.sacar(300);
        */
        
		/*
        ContaBancaria contaAle = new ContaBancaria(1000, 777, "Alê");

        contaAle.depositar(200);
        System.out.println("\nNome do Cliente: " + contaAle.getNomeCliente());
        System.out.println("Saldo Atual ($): " + contaAle.getSaldo());
        System.out.println("Cheque Especial Disponível ($): " + contaAle.getChequeEspecial());

        contaAle.sacar(150);
        System.out.println("\nApós saque de 150:");
        System.out.println("Saldo Atual ($): " + contaAle.getSaldo());
        System.out.println("Cheque Especial Disponível ($): " + contaAle.getChequeEspecial());

        contaAle.sacar(100);
        System.out.println("\nApós saque de 100 (usando cheque especial):");
        System.out.println("Saldo Atual ($): " + contaAle.getSaldo());
        System.out.println("Cheque Especial Disponível ($): " + contaAle.getChequeEspecial());

        contaAle.sacar(600);
        System.out.println("\nApós tentativa de saque de 600:");
        System.out.println("Saldo Atual ($): " + contaAle.getSaldo());
        System.out.println("Cheque Especial Disponível ($): " + contaAle.getChequeEspecial());
		*/
		
		// Testando a classe Produto
		
		/*
		Produto produto = new Produto("Notebook", 2500.00, 10);
        
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
        
        produto.setPreco(-100);
        produto.setQuantidadeEstoque(-5);
        */
    }
	
}
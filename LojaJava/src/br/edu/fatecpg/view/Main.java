package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;
import br.edu.fatecpg.controller.*;

public class Main {

	public static void main(String[] args) {
		//Endereco end = new Endereco("11703-222", "Rua X", "10A", "Boqueirão");
		//Cliente cliente = new Cliente("Ale", 31, 777, 300, end);
		
		//System.out.println(cliente.toString());
		
		EnderecoController endco = new EnderecoController();
		endco.setEndereco("11733-222", "Rua A", "15", "Guilhermina");
		endco.setEndereco("12733-712", "Rua B", "9B", "Tupi");
		endco.setEndereco("20733-322", "Rua C", "5C", "Tude Bastos");
		endco.setEndereco("11733-722", "Rua D", "1E", "Canto do Forte");
		
		System.out.println(endco.getEnderecoLista());
		System.out.println("\n");
		
		ClientesController cntco = new ClientesController();
		cntco.setClientes("Fulano", 1, 7, 52.75, endco.getEndereco(0));
		cntco.setClientes("Ciclano", 2, 10, 150.77, endco.getEndereco(1));
		cntco.setClientes("The Rock", 3, 2, 4000.99, endco.getEndereco(3));

		
		System.out.println(cntco.getClientesLista());
	}

}
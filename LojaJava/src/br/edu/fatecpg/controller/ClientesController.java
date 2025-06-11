package br.edu.fatecpg.controller;
import java.util.List;
import java.util.ArrayList;
import br.edu.fatecpg.model.*;

public class ClientesController {
	private List<Cliente> clientes = new ArrayList<>();
	
	public void setClientes(String nome, int id, int cd, double crd, Endereco end) {
		Cliente cnt = new Cliente(nome, id, cd, crd, end);
		clientes.add(cnt);
	}
	
	public String getClientesLista() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < clientes.size(); i++) {
			sb.append(clientes.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}

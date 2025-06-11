package br.edu.fatecpg.controller;
import java.util.List;
import java.util.ArrayList;
import br.edu.fatecpg.model.*;

public class EnderecoController {
	private List<Endereco> enderecos= new ArrayList<>();
	
	public void setEndereco(String cep, String rua, String num, String bairro) {
		Endereco end = new Endereco(cep, rua, num, bairro);
		enderecos.add(end);
	}
	
	public Endereco getEndereco(int index){ 
	        return enderecos.get(index);
	}
	public String getEnderecoLista() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < enderecos.size(); i++) {
			sb.append(enderecos.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}

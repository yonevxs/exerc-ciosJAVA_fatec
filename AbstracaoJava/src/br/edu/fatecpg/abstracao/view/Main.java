package br.edu.fatecpg.abstracao.view;
//import br.edu.fatecpg.abstracao.model.Carro;
import br.edu.fatecpg.abstracao.model.Pessoa;
public class Main {

	public static void main(String[] args) {
		Pessoa ale = new Pessoa();
		
		ale.nome = "Alessandro";
		ale.cpf = 55567644777L;
		ale.idade = 31;
		
		ale.estudar();
		ale.falar();
		
		
	}
}
		
		
		


/*		System.out.println("Pós Carnaval!");
		//String nome = "Ale";
		
		Carro meuCarro = new Carro();
		
		meuCarro.marca = "Renault";
		meuCarro.modelo = "Logan";
		meuCarro.ano = 2015;
		
		System.out.println("O modelo do meu carro é: " + meuCarro.modelo);
		
		Carro novoCarro = new Carro();
		
		novoCarro.marca = "Volkswagen";
		novoCarro.modelo = "Gol" ;
		novoCarro.ano = 2020;
		
		System.out.println("O modelo do meu carro é: " + novoCarro.modelo);
		novoCarro.ligar();
		
		novoCarro.acelerar();
		novoCarro.acelerar();
		novoCarro.acelerar();
		novoCarro.acelerar();
	
		novoCarro.frear();
		novoCarro.frear();
		
		meuCarro.ligar();
		meuCarro.acelerar();
	}

} /*
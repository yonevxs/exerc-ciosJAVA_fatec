package br.edu.fatecpg.fila.view;
import br.edu.fatecpg.fila.model.Fila;

public class Main {

	public static void main(String[] args) {
		Fila consulta = new Fila(20); //Definindo a quantidade de pessoas na fila
		

		consulta.atender_paciente(2);
		consulta.novo_paciente(3);
		consulta.atender_paciente(2);
		consulta.atender_paciente(1);
		consulta.atender_paciente(3);
		consulta.atender_paciente(4);
		consulta.atender_paciente(2);
		consulta.atender_paciente(2);
		consulta.atender_paciente(2);
		consulta.atender_paciente(2);
		consulta.atender_paciente(2);
		consulta.atender_paciente(2);
		consulta.atender_paciente(2);
		consulta.atender_paciente(2);

	}

}

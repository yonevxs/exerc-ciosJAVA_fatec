package br.edu.fatecpg.fila.model;

public class Fila {
	private int qtdPacientes; //Fila
	
	public Fila(int qtdPacientes) {
		this.qtdPacientes = qtdPacientes;

	//Getters e Setters
	
	public int getqtdPacientes() {
		return qtdPacientes;
	}
	public void setqtdPacientes(int qtdPacientes) {
		this.qtdPacientes = qtdPacientes;
	}
	
	public void atender_paciente(int paciente) {
		if(paciente > 2) {
			System.out.println("O consultório só permite 2 pacientes por consulta!");
			qtdPacientes -= 2;
			System.out.println("Apenas dois pacientes entraram na consulta.");
			System.out.println("Quantidade de pacientes no consultório: " + "2");
			System.out.println("Quantidade de pacientes na fila: " + qtdPacientes);
			
		} else if(qtdPacientes <= 0) {
			System.out.println("A fila está vazia!");
		}
		else {
			qtdPacientes -= paciente;
			System.out.println("Quantidade de pacientes no consultório: " + paciente);
			System.out.println("Quantidade de pacientes na fila: " + qtdPacientes);
		}
	}
	
	public void novo_paciente(int pacienteNovo) {
		qtdPacientes += pacienteNovo;
		System.out.println("Novo paciente na fila!");
		System.out.println("Quantidade de pacientes na fila de espera: " + qtdPacientes);
		
	}
}
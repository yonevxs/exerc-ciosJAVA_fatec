package br.edu.fatecpg.model;
import java.util.Scanner;

public class SistemaDeSeguranca implements Autenticavel{
	Scanner scan = new Scanner(System.in);
	private String usuario;
	private String senha;
	private boolean autenticado = false;
	
	public SistemaDeSeguranca(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean estaAutenticado() {
		return autenticado;
	}

	@Override
	public void login(String usuario, String senha) {
		System.out.print("Usuario: ");
		this.usuario = scan.nextLine();
		System.out.print("Senha: ");
		this.senha = scan.nextLine();
		
		while(!this.senha.equals("1234") || !this.usuario.equals("admin")) {
			System.out.println("Usuario ou senha estão errados! Tente novamente");
			System.out.print("Usuario: ");
			this.usuario = scan.nextLine();
			System.out.print("Senha: ");
			this.senha = scan.nextLine();
			break;
		}
		System.out.println("Usuario logado: " + this.usuario);
		autenticado = true;
		scan.close();
	}
	@Override
	public void logout() {
		System.out.println("Logout efetuado!");
		this.usuario = null;
		this.senha = null;
		autenticado = false;
		
	}
	public boolean estaLogado() {
		return autenticado;
	}
}

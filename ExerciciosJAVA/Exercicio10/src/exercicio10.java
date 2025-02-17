/*Defina uma senha secreta (ex: Java123). Use um loop while para pedir ao usuárrio que insira
 * a senha. Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário que a tentativa
 * foi inválida Se ele acertar, saia do loop e imprima uma mensagem de sucesso.*/

import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String senha = "Java123";
		String senha_digitada;
		
		System.out.print("Insira a senha: ");
		senha_digitada = scan.nextLine();
		scan.close();
		
		while (!senha_digitada.equals(senha)) {
			System.out.println("Senha errada! Tente novamente");
			System.out.println("Insira a senha: ");
			senha_digitada = scan.nextLine();
		}
		
		System.out.print("Senha digitada com sucesso!");

	}

}

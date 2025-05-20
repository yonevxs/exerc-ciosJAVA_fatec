/*Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, 
 * adulta ou idosa (use, por exemplo, 18 para adulta e 60 para idosa).*/

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		scan.close();
		
		if(idade < 18) {
			System.out.print("Você é menor de idade.");
		}
		if (idade >= 18 && idade < 60) {
			System.out.print("Você é adulto(a)!");
		}
		else if (idade >= 60){
			System.out.print("Você é idoso(a).");
		}

	}

}

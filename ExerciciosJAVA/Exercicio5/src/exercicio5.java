/*Crie um programa que solicite ao usuário a entrada de um número inteiro. 
 * Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("O número digitado é par!");
		}
		else {
			System.out.print("O número digitado é impar!");
		}

	}

}

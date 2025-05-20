/*Peça ao usuário para inserir dois números inteiros. 
 * Compare os números e imprima uma mensagem indicando se são iguais, diferentes, 
 * o primeiro é maior ou o segundo é maior.*/

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		n1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = scanner.nextInt();
		scanner.close();
		
		
		if (n1 == n2) {
			System.out.println("O primeiro e o segundo número são iguais!");
		}
		else {
			System.out.println("");
			System.out.println("Os números são diferentes!");
			if(n1 > n2) {
				System.out.println("O primeiro número é maior que o segundo!");
			}
			else {
				System.out.println("O segundo número é maior que o primeiro!");
			}
		}
	}

}

/*Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. 
 * Calcule e imprima a soma dos primeiros n números ímpares. 
 * Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.*/

import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		n = scan.nextInt();
		
		int soma = 0;
		
		for (int i = 1; i <= n * 2; i += 2) {
			
			soma += i;
		}
		
		System.out.print("A soma dos " + n + " números ímpares é: " + soma);
	}

}

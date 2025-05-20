/*Crie um menu que oferece duas opções ao usuário: 
 * "1. Calcular área do quadrado" e "2. Calcular área do círculo". 
 * Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		int opcao;
		float comp, alt, raio;
		Scanner scan = new Scanner(System.in);
		System.out.println("CÁLCULO DE ÁREAS");
		System.out.println("1 - Área do quadrado");
		System.out.println("2 - Área do circulo");
		System.out.println("");
		
		
		System.out.print("Área selecionada: ");
		opcao = scan.nextInt();
		
		
		switch (opcao) {
			case 1:
				System.out.print("Insira o comprimento do quadrado: ");
				comp = scan.nextFloat();
				
				System.out.print("Insira a altura do quadrado: ");
				alt = scan.nextFloat();
				
				float areaq = comp * alt;
				
				System.out.println("A área do quadrado é: " + areaq);
				
				break;
			case 2:
				System.out.print("Insira o valor do raio do círculo: ");
				raio = scan.nextFloat();
				
				double areac = (raio * raio) * 3.14;
				
				System.out.print("A área do círculo é: " + areac);
				
				break;
			default:
				System.out.println("Insira um valor válido!");
				
				break;
				
		}
		scan.close();
		
	}

}

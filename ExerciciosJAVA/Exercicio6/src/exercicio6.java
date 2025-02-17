/*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		num = scan.nextInt();
		scan.close();
		
		int fat = 1; 
		
		for(int i = num; i >= 1; i--) {
			fat = fat * i;
		}
		System.out.println("O fatorial de "+ num + " é: " + fat);
	}

}

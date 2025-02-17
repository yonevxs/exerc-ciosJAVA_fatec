/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/


import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = scan.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			
			int tabuada = num * i;
			System.out.println(num + " x " + i + " = " + tabuada);
		}
	}

}

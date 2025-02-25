
//Lendo os valores de duas matrizes

package br.edu.fatecpg;
import java.util.Scanner;
public class Soma_matrizes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizUm = new int[3][3];
		int i = 0, j = 0;
		
		int[][] matrizDois = new int[3][3];
		int a = 0, b = 0;
		
		//Dando valores para a primeira matriz
		System.out.println("Insira um valor do tipo inteiro: ");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				
				matrizUm[i][j] = scan.nextInt();
				
			}
		}
		
		
		//Dando valores para a segunda matriz
		System.out.println("Insira um valor do tipo inteiro: ");
		for(a = 0; a < 3; a++) {
			for(b = 0; b < 3; b++) {
				
				matrizDois[a][b] = scan.nextInt();
			}
		}
		
	
		//Imprimindo a primeira matriz
		System.out.println("Os valores informados são:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matrizUm[i][j] + " "); // Imprime cada elemento com um espaço
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
        
        System.out.println(" ");
        
        //Imprimindo a segunda matriz
        System.out.println("Os valores informados são:");
        for (a = 0; a < 3; a++) {
            for (b = 0; b < 3; b++) {
                System.out.print(matrizDois[a][b] + " "); 
            }
            System.out.println(); 
        }
        scan.close();
	}

}

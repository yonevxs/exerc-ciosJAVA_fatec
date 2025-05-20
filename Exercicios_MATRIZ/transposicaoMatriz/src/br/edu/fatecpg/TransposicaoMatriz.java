/*Desenvolva um código que realiza a transposição de uma matriz 
 * (as colunas viram linhas e as linhas viram colunas). 
 * Peça aos usuários para inserirem os elementos da matriz, exibindo 
 * a matriz transposta no console.*/

package br.edu.fatecpg;
import java.util.Scanner;
public class TransposicaoMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas linhas tem a sua matriz?: ");
		int linha = scan.nextInt();
		System.out.print("Quantas colunas tem a sua matriz?: ");
		int coluna = scan.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = scan.nextInt();
			}
		}

		//Criando a matriz transposta
		int[][] matrizTransposta = new int[coluna][linha];
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		System.out.println(" ");
		System.out.println("Matriz transposta:");
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.print(matrizTransposta[i][j] + " "); 
            }
            System.out.println(); 
        }
        scan.close();
	}

}

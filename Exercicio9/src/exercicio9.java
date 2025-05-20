/*Lista de Nomes: Peça ao usuário que insira 5 nomes (um de cada vez). Após innseir todos os nomes,
 * peça outro nome e use um loop for para percorrer a lista e verificar se o 6º (último) nome digitado
 * está presente no array dos 5 nomes informados inicialmente.*/

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        String[] nomes = new String[5]; 
        String novoNome; 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine(); 
        }

        System.out.println("Insira um novo nome: ");
        novoNome = scanner.nextLine();
        scanner.close();

        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (nomes[i].equalsIgnoreCase(novoNome)) { 
            	encontrado = true;
                break; 
            }
        }
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}
import br.edu.fatecpg.noticiaapi.model.*;
import br.edu.fatecpg.noticiaapi.controller.*;
import br.edu.fatecpg.noticiaapi.service.*;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        noticiaController noticiaController = new noticiaController();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o tema da notícia: ");
        String tema = s.nextLine();

        System.out.println("Digite a quantidade de notícias: ");
        int quantidade = s.nextInt();


        noticiaController.mostrarNoticias(tema, quantidade);
        }
    }
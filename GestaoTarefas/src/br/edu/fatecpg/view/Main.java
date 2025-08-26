package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;
import br.edu.fatecpg.controller.TarefaController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TarefaController tc = new TarefaController();
        System.out.println("SISTEMA DE GESTÃO DE TAREFAS - OPÇÕES");
        System.out.println("1 - Criar Tarefa");
        System.out.println("2 - Editar Tarefa");
        System.out.println("3 - Listar Tarefa");
        System.out.println("4 - Excluir Tarefa");

        System.out.println(" ");
        System.out.print("Escolha seu módulo: ");

        int valor = scan.nextInt();

        switch(valor){
            case 1:
                System.out.println("Crie a tarefa");
                String tarefa = tc.criarTarefa("Consertar computador","Suporte TI", "Em andamento");
                System.out.println(tarefa);
                break;
            case 2:
                System.out.println("Edite a tarefa");
                String edittarefa = tc.editarTarefa("Aspirar a casa", "Não concluído", "Concluído");
                System.out.println(edittarefa);
                break;
            case 3:
                System.out.println("Listar tarefas");
                String listartarefas = tc.listarTarefas();
                System.out.println(listartarefas);
                break;
            case 4:
                System.out.println("Excluir Tarefa");
                String deletartarefa = tc.excluirTarefa("Consertar computador");
                break;
            default:
                System.out.println("ID de tarefa inválido!");
                break;
        }

    }
}

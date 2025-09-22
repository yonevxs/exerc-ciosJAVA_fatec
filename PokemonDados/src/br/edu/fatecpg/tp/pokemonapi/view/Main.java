package br.edu.fatecpg.tp.pokemonapi.view;
import java.util.List;
import java.util.Scanner;
import br.edu.fatecpg.tp.pokemonapi.client.*;
import br.edu.fatecpg.tp.pokemonapi.model.*;
import br.edu.fatecpg.tp.pokemonapi.service.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ConsomeApi consomeApi = new ConsomeApi();
        IConverteDados cdados = new ConverteDados();

        String api = "https://pokeapi.co/api/v2/pokemon/";
        System.out.println("Digite o nome do pokemon ou digite 'sair' para encerrar: ");

        while(true){
            System.out.print("> ");
             String pokemon = scan.nextLine().toLowerCase().trim();

             if(pokemon.equalsIgnoreCase("sair")){
                 System.out.println("Encerrando busca...");
                 break;
             }
             if (pokemon.isEmpty()){
                 continue;
             }
            try {
                String url = api + pokemon;

                System.out.println("Buscando dados de " + pokemon + "...");
                String jsonResponse = consomeApi.obterDados(url);

                DadosPokemon dadosPokemon = cdados.converte(jsonResponse, DadosPokemon.class);

                List<String> tiposP = dadosPokemon.tipos().stream()
                        .map(entrada -> entrada.tipo().name())
                        .toList();

                System.out.println("\n--- Informações do Pokémon ---");
                System.out.println("Nome: " + dadosPokemon.nome());
                System.out.println("Altura: " + dadosPokemon.altura());
                System.out.println("Peso: " + dadosPokemon.peso());
                System.out.println("Tipo(s): " + String.join(", ", tiposP));
                System.out.println("----------------------------------\n");

            } catch (RuntimeException e) {
                System.err.println("Erro: Pokémon não encontrado. Verifique a ortografia e tente novamente.\n");
            }

        }
    }
}

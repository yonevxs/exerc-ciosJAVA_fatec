package br.edu.fatecpg.tecprog.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import br.edu.fatecpg.tecprog.stream.model.*;

public class Main {
    public static void main(String[] args){
        // Exemplo para exibir o dobro dos números - stream e lambda
        /*List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream().map(n -> n * 2).forEach(System.out::println);

        // Exemplo para filtrar palavras por tamanho
        List<String> palavras = Arrays.asList("PC", "Mouse", "Teclado", "Fone");
        List<String> palavrasFiltradas = palavras.stream().filter(p -> p.length() > 5).toList();
        palavrasFiltradas.forEach(System.out::println);

        // Soma do dobro dos pares
        int soma = numeros.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, Integer::sum);
        System.out.println(soma);*/

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ale", 31));
        pessoas.add(new Pessoa("Maria", 4));
        pessoas.add(new Pessoa("Natália", 29));
        pessoas.add(new Pessoa("Nicolas", 21));
        pessoas.add(new Pessoa("Ana", 27));
        pessoas.add(new Pessoa("Marta", 41));

        // Pessoas maiores de idade
        List<Pessoa> maiorIdade = pessoas.stream().filter(p -> p.getIdade() > 17).toList();
        maiorIdade.forEach(System.out::println);

        System.out.println("\n");

        // Nomes de pessoas que começam com a letra "A"
        List<Pessoa> nomesComA = pessoas.stream().filter(p -> p.getNome().startsWith("A")).toList();
        nomesComA.forEach(System.out::println);

        System.out.println("\n");

        // Pessoas com 30+
        pessoas.stream().filter(pessoa -> pessoa.getIdade() > 29).forEach(System.out::println);

    }
}

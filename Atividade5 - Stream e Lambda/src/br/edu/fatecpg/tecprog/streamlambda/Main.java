package br.edu.fatecpg.tecprog.streamlambda;

import br.edu.fatecpg.tecprog.streamlambda.model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        // 1. Filtrar produtos da categoria "Eletronicos"
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 1900.99, "Eletrônico"));
        produtos.add(new Produto("Air Fryer", 400.99, "Eletrônico"));
        produtos.add(new Produto("Perfume 212 VIP", 700.99, "Cosmético"));
        produtos.add(new Produto("Moletom HVCA", 300, "Roupas"));
        produtos.add(new Produto("Calça Levis", 250.99, "Roupas"));
        produtos.add(new Produto("Perfume ZAAD", 250.50, "Cosmético"));
        produtos.add(new Produto("Teclado AJAZZ", 478.96, "Eletrônico"));

        List<Produto> produtosEletronicos = produtos.stream().filter(p -> p.getCategoria().equals("Eletrônico")).toList();
        produtosEletronicos.forEach(System.out::println);

        // 2. Aplicar um desconto de 10% nos produtos eletrônicos e ordenar por preço (crescente)
        List<Double> descontoEletronico = produtosEletronicos.stream().map(p -> p.getPreco() - (p.getPreco() *10)/100).sorted().toList();
        descontoEletronico.forEach(d -> System.out.printf("%.2f%n", d));

        // 3. Calcular o total gasto em produtos da categoria "Roupas" usando reduce
        double totalroupas = produtos.stream().filter(p -> p.getCategoria().equals("Roupas")).map(p -> p.getPreco()).reduce(0.0, Double::sum);
        System.out.println("O total dos produtos da categoria 'Roupas' é de R$" + totalroupas);

        // 4. Agrupar produtos por categoria e calcular a média de preço de cada grupo
        Map<String, Double> mediaCategorias = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria, Collectors.averagingDouble(Produto::getPreco)));
        System.out.println("Média por categoria");
        mediaCategorias.forEach((categoria, media) -> System.out.printf("Categoria: %s | Média: R$ %.2f%n", categoria, media)
        );


    }
}

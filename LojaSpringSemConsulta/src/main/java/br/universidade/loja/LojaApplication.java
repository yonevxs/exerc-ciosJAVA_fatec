package br.universidade.loja;

import br.universidade.loja.model.Categoria;
import br.universidade.loja.model.Estoque;
import br.universidade.loja.model.Produto;
import br.universidade.loja.repository.CategoriaRepository;
import br.universidade.loja.repository.EstoqueRepository;
import br.universidade.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class LojaApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository catRepo;
	@Autowired
	private ProdutoRepository prodRepo;
	@Autowired
	private EstoqueRepository estRepo;



    public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Loja inicializada!");

        // Criação das categorias
//        Categoria informatica = new Categoria("Informática");
//        Categoria perifericos = new Categoria("Periféricos");
//        Categoria acessorios = new Categoria("Acessórios");
//        catRepo.saveAll(Arrays.asList(informatica, perifericos, acessorios));
//
//        // Criação dos produtos
//        Produto notebook = new Produto("Notebook Dell Inspiron 15", new BigDecimal("3500.00"), informatica);
//        Produto impressora = new Produto("Impressora HP LaserJet Pro M404n", new BigDecimal("1200.00"), perifericos);
//        Produto monitor = new Produto("Monitor LG UltraWide 29", new BigDecimal("1800.00"), perifericos);
//        Produto teclado = new Produto("Teclado Mecânico Corsair K95", new BigDecimal("900.00"), acessorios);
//        Produto mouse = new Produto("Mouse Logitech MX Master 3", new BigDecimal("600.00"), acessorios);
//        prodRepo.saveAll(Arrays.asList(notebook, impressora, monitor, teclado, mouse));
//
//        // Criação dos estoques
//        Estoque estoqueNotebook = new Estoque(notebook, 15);
//        Estoque estoqueImpressora = new Estoque(impressora, 10);
//        Estoque estoqueMonitor = new Estoque(monitor, 8);
//        Estoque estoqueTeclado = new Estoque(teclado, 20);
//        Estoque estoqueMouse = new Estoque(mouse, 25);
//        estRepo.saveAll(Arrays.asList(estoqueNotebook, estoqueImpressora, estoqueMonitor, estoqueTeclado, estoqueMouse));

//        // 1. Spring Data JPA - Consultas Derivadas
//        System.out.println("--- CONSULTAS DERIVADAS ---");
//
//        // Listando produtos da categoria "Periféricos"
//        List<Produto> produtosPorCategoria = prodRepo.findByCategoriaNome("Periféricos");
//        produtosPorCategoria.forEach(p -> System.out.println("Produto por categoria: " + p.getNome()));
//
//        // Buscando produtos com preço acima de 1000.00
//        List<Produto> produtosCaros = prodRepo.findByPrecoGreaterThan(new BigDecimal("1000.00"));
//        produtosCaros.forEach(p -> System.out.println("Produto caro: " + p.getNome()));
//
//        // Verificando se existe um produto chamado "Mouse Logitech MX Master 3"
//        boolean existeProduto = prodRepo.existsByNome("Mouse Logitech MX Master 3");
//        System.out.println("Existe 'Mouse Logitech MX Master 3'? " + existeProduto);


//            List<Produto> eletronicosBaratos = prodRepo.findByCategoriaNomeAndPrecoLessThan("Eletrônicos", new BigDecimal("4000.00"));
//
//            System.out.println("\n--- Buscando 'Eletrônicos' com preço < " + "4000.00" + " ---");
//            eletronicosBaratos.forEach(p -> System.out.println("Produto: " + p.getNome() + " | Preço: " + p.getPreco()));

        // 2. Native Query
        System.out.println("\n--- CONSULTAS NATIVAS ---");

        // Obtendo a quantidade em estoque do "Notebook Dell Inspiron 15"
        Integer quantidadeEstoque = estRepo.findQuantidadeByProdutoNomeNative("Notebook Dell Inspiron 15");
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);

        // Listando produtos com estoque baixo (menor que 10)
        List<Produto> produtosComEstoqueBaixo = estRepo.findProdutosComEstoqueAbaixoDe(10);
        produtosComEstoqueBaixo.forEach(p -> System.out.println("Produto com estoque baixo: " + p.getNome()));

            System.out.println("\n--- Consulta Nativa com Agregação (Soma Total) ---");

            Long totalItens = estRepo.findTotalItensEmEstoque();
            System.out.println("Quantidade total de TODOS os itens no estoque: " + totalItens);

        // 3. JPQL

        System.out.println("\n--- CONSULTAS JPQL ---");

        // Buscando estoques da categoria "Informática"
        List<Estoque> estoquesPorCategoria = estRepo.findByCategoriaNomeJpql("Informática");
        estoquesPorCategoria.forEach(e -> System.out.println("Estoque por categoria: " + e.getProduto().getNome()));

        // Calculando o valor total por produto em estoque
        List<Map<String, Object>> valoresTotais = estRepo.findValorTotalPorProdutoJpql();
        valoresTotais.forEach(map -> System.out.println("Produto: " + map.get("produto") + ", Valor Total: " + map.get("valorTotal")));

        // Buscando produtos com estoque entre 10 e 20 unidades
        List<Produto> produtosComEstoqueEntre = estRepo.findProdutosComEstoqueEntre(10, 20);
        produtosComEstoqueEntre.forEach(p -> System.out.println("Produto com estoque entre 10 e 20: " + p.getNome()));

    }

}

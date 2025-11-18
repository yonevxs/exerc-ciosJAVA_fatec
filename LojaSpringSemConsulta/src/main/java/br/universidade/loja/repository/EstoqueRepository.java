package br.universidade.loja.repository;

import br.universidade.loja.model.Estoque;
import br.universidade.loja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    // consultas customizadas aqui
    // 1) Obter quantidade em estoque de um produto
    @Query( value = "SELECT quantidade FROM estoque e JOIN produto p ON e.produto_id = p.id WHERE p.nome = :nome", nativeQuery = true)
    Integer findQuantidadeByProdutoNomeNative(@Param("nome") String nomeProduto);

    // 2) Listar produtos com estoque abaixo de um limite
    @Query(value = "SELECT p.* FROM produto p JOIN estoque e ON p.id = e.produto_id WHERE e.quantidade < :limite", nativeQuery = true)
    List<Produto> findProdutosComEstoqueAbaixoDe(@Param("limite") int limite);

    // 1) Buscar estoques de produtos de uma categoria
    @Query("SELECT e FROM Estoque e WHERE e.produto.categoria.nome = :nomeCategoria")
    List<Estoque> findByCategoriaNomeJpql(@Param("nomeCategoria") String nomeCategoria);

    // 2) Calcular valor total de cada item em estoque (preço * quantidade)
    @Query("SELECT new map(e.produto.nome AS produto, (e.produto.preco * e.quantidade) AS valorTotal) FROM Estoque e")
    List<Map<String, Object>> findValorTotalPorProdutoJpql();

    // 3) Retornar produtos cujo estoque esteja entre dois valores
    @Query("SELECT e.produto FROM Estoque e WHERE e.quantidade BETWEEN :min AND :max")
    List<Produto> findProdutosComEstoqueEntre(@Param("min") int min, @Param("max") int max);

    // Crie uma consulta nativa que retorne a quantidade total de itens em estoque (a soma de todas as quantidades).
    @Query(value = "SELECT SUM(e.quantidade) FROM estoque e", nativeQuery = true)
    Long findTotalItensEmEstoque();
}

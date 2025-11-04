package br.edu.fatecpg.spring_banco.repository;
import br.edu.fatecpg.spring_banco.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    // JpaRepository<TipoDaEntidade, TipoDoId>
    // Novos métodos de consulta podem ser adicionados aqui
}

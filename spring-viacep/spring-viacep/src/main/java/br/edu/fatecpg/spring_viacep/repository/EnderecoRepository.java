package br.edu.fatecpg.spring_viacep.repository;
import br.edu.fatecpg.spring_viacep.model.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    Optional<Endereco> findByCep(String cep);
}

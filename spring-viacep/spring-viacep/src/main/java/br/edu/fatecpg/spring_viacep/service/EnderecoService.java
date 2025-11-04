package br.edu.fatecpg.spring_viacep.service;
import br.edu.fatecpg.spring_viacep.model.*;
import br.edu.fatecpg.spring_viacep.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class EnderecoService {

    private final WebClient webClient;
    private final EnderecoRepository enderecoRepository;
    private static final  String VIACEP_url = "https://viacep.com.br/ws/{cep}/json/";

    @Autowired
    public EnderecoService(WebClient.Builder webClientBuilder, EnderecoRepository enderecoRepository){
        this.webClient = webClientBuilder.baseUrl("https://viacep.com.br/ws/").build();
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco buscarESalvar(String cep){
        Optional<Endereco> enderecoExistente = enderecoRepository.findByCep(cep);
        if(enderecoExistente.isPresent()){
            return enderecoExistente.get();
        }

        Endereco endereco = webClient.get().uri("{cep}/json/", cep).retrieve().bodyToMono(Endereco.class).block();

        if(endereco != null && endereco.getCep() != null){
            return enderecoRepository.save(endereco);
        }
        throw new RuntimeException("CEP não encontrado.");
    }
}

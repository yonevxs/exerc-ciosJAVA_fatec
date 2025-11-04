package br.edu.fatecpg.spring_viacep.runner;

import br.edu.fatecpg.spring_viacep.model.Endereco;
import br.edu.fatecpg.spring_viacep.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EnderecoRunner implements CommandLineRunner {

    @Autowired
    private EnderecoService cepService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>> INICIANDO PROCESSAMENTO DE ENDEREÇOS <<<");

        List<String> cepsParaProcessar = Arrays.asList(
                "01001200",
                "11705010",
                "99999999"
        );

        for (String cep : cepsParaProcessar) {
            System.out.println("------------------------------------");
            System.out.println("Processando CEP: " + cep);
            try {
                // Chama o serviço que busca na API e salva no banco de dados
                Endereco enderecoSalvo = cepService.buscarESalvar(cep);

                // Se o CEP foi salvo ou já existia no banco
                System.out.println("SUCESSO! Endereço processado e salvo (ou encontrado no BD):");
                System.out.println("  -> Logradouro: " + enderecoSalvo.getLogradouro());
                System.out.println("  -> Cidade/UF: " + enderecoSalvo.getCidade() + "/" + enderecoSalvo.getUf());

            } catch (Exception e) {
                // Se ocorrer um erro (ex: CEP não encontrado, erro de conexão, etc.)
                System.err.println("ERRO ao processar o CEP " + cep + ": " + e.getMessage());
            }
        }

        System.out.println(">>> PROCESSAMENTO DE ENDEREÇOS FINALIZADO <<<");
    }
}
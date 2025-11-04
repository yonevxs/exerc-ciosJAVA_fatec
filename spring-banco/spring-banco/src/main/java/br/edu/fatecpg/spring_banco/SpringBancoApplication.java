package br.edu.fatecpg.spring_banco;

import br.edu.fatecpg.spring_banco.model.*;
import br.edu.fatecpg.spring_banco.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class SpringBancoApplication implements CommandLineRunner{
    @Autowired // O Spring injeta uma instância do nosso repositório
    private AlunoRepository alunoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBancoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern patternEmail = Pattern.compile(regexEmail);


        System.out.println(">>> INICIANDO DEMONSTRAÇÃO <<<");
        // 1. Criando e salvando um novo aluno
        System.out.println("Salvando um novo aluno...");
        Aluno novoAluno = new Aluno("Lucas", "12377788812", "lucas@gmail.com");

        Matcher matcherEmail = patternEmail.matcher(novoAluno.getEmail());
        if(matcherEmail.matches()){
            alunoRepository.save(novoAluno);
            System.out.println("Aluno salvo com sucesso!");
        } else{
            System.out.println("Erro - o e-mail '" + novoAluno.getEmail() + "' é inválido.");
        }

        // 2. Selecionando todos os alunos do banco
        System.out.println("\nBuscando todos os alunos:");
        List<Aluno> alunos = alunoRepository.findAll();
        alunos.stream().forEach(System.out::println);
        System.out.println(">>> DEMONSTRAÇÃO FINALIZADA <<<");

    }
}


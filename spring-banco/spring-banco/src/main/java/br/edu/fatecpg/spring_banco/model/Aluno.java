package br.edu.fatecpg.spring_banco.model;
import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id // Aponta que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Deixa o banco gerar o valor (autoincremento)
    private Long id;

    @Column(name = "nome_completo", length = 100, nullable = false) // Mapeia para uma coluna específica
    private String nome;

    @Column(unique = true, nullable = false) // Define que o CPF deve ser único
    private String cpf;

    @Column(unique = true, nullable = false)
    private String email;

    // Construtor padrão é exigido pelo Hibernate
    public Aluno(){
    }

    // Construtor para facilitar a criação de novos alunos
    public Aluno(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email = " + email + '\'' +
                '}';
    }
}

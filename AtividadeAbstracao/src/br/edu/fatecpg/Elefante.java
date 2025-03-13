package br.edu.fatecpg;

public class Elefante {
    // Atributos
    String nome;
    int idade;
    double peso;

    // Método construtor
    public Elefante(String nomeInicial, int idadeInicial, double pesoInicial) {
        nome = nomeInicial;
        idade = idadeInicial;
        peso = pesoInicial;
    }

    public void trombetear() {
        System.out.println(nome + " está trombeteando!");
    }

    public void mover(double distancia) {
        System.out.println(nome + " caminhou " + distancia + " metros.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
    }
}

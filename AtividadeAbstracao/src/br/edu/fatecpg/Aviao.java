package br.edu.fatecpg;

public class Aviao {
    // Atributos
    String modelo;
    int capacidadePassageiros;
    double velocidadeMaxima;

    // Método construtor
    public Aviao(String modeloInicial, int capacidadeInicial, double velocidadeInicial) {
        modelo = modeloInicial;
        capacidadePassageiros = capacidadeInicial;
        velocidadeMaxima = velocidadeInicial;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }

    public void acelerar(double incremento) {
        velocidadeMaxima += incremento;
        System.out.println("Velocidade aumentada para: " + velocidadeMaxima + " km/h");
    }

    public void alterarModelo(String novoModelo) {
        modelo = novoModelo;
        System.out.println("Modelo alterado para: " + modelo);
    }
}

package br.edu.fatecpg;

public class Motocicleta {
    // Atributos
    private String marca;
    private String modelo;
    private int cilindradas;

    // Método construtor
    public Motocicleta(String marca, String modelo, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public void ligar() {
        System.out.println("A motocicleta " + marca + " " + modelo + " ligou.");
    }

    public void acelerar() {
        System.out.println("A motocicleta " + marca + " " + modelo + " acelerou.");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
}
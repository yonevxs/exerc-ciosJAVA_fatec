package br.edu.fatecpg;

public class Smartphone {
    // Atributos
    String marca;
    String modelo;
    int armazenamento;

    // Método construtor
    public Smartphone(String marcaInicial, String modeloInicial, int armazenamentoInicial) {
        marca = marcaInicial;
        modelo = modeloInicial;
        armazenamento = armazenamentoInicial;
    }

    // Métodos
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void tirarFoto() {
        System.out.println("Capturando foto...");
    }

    public void instalarAplicativo(String nomeApp) {
        System.out.println("Instalando " + nomeApp + "...");
    }

    public static void main(String[] args) {
        // Cria um objeto Smartphone usando o construtor
        Smartphone meuSmartphone = new Smartphone("Samsung", "Galaxy S23", 256);

        // Chama os métodos
        meuSmartphone.fazerLigacao("11 99999-9999");
        meuSmartphone.tirarFoto();
        meuSmartphone.instalarAplicativo("Instagram");
    }
}
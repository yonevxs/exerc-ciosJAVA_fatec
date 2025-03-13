package br.edu.fatecpg;

public class ViaLactea {
    // Atributos
    private String tipo;
    private long numeroDeEstrelas;
    private double diametroAnosLuz;

    // Método construtor
    public ViaLactea(String tipoInicial, long numeroEstrelasInicial, double diametroInicial) {
        tipo = tipoInicial;
        numeroDeEstrelas = numeroEstrelasInicial;
        diametroAnosLuz = diametroInicial;
    }

    // Métodos

    public String tipoVia() {
        return tipo;
    }

    public long numeroEstrelas() {
        return numeroDeEstrelas;
    }

    public double diametroAnosLuz() {
        return diametroAnosLuz;
    }

    public static void main(String[] args) {
        // Cria um objeto ViaLactea
        ViaLactea viaLactea = new ViaLactea("Espiral", 1000000000000L, 100000.0);

        // Altera o tipo da galáxia
        viaLactea.tipoVia("Espiral Barrada");
    }
}

package br.edu.fatecpg.consomeapi.model;

import com.google.gson.annotations.SerializedName;

public class Endereco {
    private String cep;
    @SerializedName("logradouro")
    private String rua;
    private String bairro;
    private String localidade;
    private String estado;

    public Endereco(String cep, String estado, String localidade, String bairro, String rua) {
        this.cep = cep;
        this.estado = estado;
        this.localidade = localidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", estado='" + estado + '\'' +
                '}' + "\n";
    }
}

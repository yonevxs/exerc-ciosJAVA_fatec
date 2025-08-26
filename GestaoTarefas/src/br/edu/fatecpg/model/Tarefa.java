package br.edu.fatecpg.model;

public class Tarefa {
    private int id;
    private String ds_tarefa;
    private String categoria;
    private String status;

    public Tarefa(int id, String ds_tarefa, String categoria, String status){
        this.id = id;
        this.ds_tarefa = ds_tarefa;
        this.categoria = categoria;
        this.status = status;
    }

    public int getId(){
        return this.id;
    }
    public String getDsTarefa(){
        return this.ds_tarefa;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public String getStatus(){
        return this.status;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setDsTarefa(String ds_tarefa){
        this.ds_tarefa = ds_tarefa;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "\nID: " + id + " | Tarefa: " + ds_tarefa + " | Categoria: " + categoria + " | Status: " + status;
    }
}

package br.edu.fatecpg.controller;
import br.edu.fatecpg.model.Tarefa;
import br.edu.fatecpg.model.Banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    public String criarTarefa(String ds_tarefa, String categoria, String status){
        String query = "INSERT INTO tarefa(ds_tarefa, nm_categoria, status) VALUES (?, ?, ?)";

        try(var conexao = Banco.conectar()){
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, ds_tarefa);
            stmt.setString(2, categoria);
            stmt.setString(3, status);
            stmt.execute();
            return "Tarefa criada com sucesso!";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
    public String editarTarefa(String ds_tarefa, String oldStatus, String newStatus){
        String query = "UPDATE tarefa SET status = ? WHERE ds_tarefa = ? AND status = ?";

        try(var conexao = Banco.conectar()){
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, newStatus);
            stmt.setString(2, ds_tarefa);
            stmt.setString(3, oldStatus);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Tarefas atualizada com sucesso.";
            } else {
                return "Nenhuma consulta encontrada com os parâmetros fornecidos.";
            }
        } catch (Exception e) {
            return "Erro ao atualizar consulta: " + e.getMessage();
        }

    }
    public String listarTarefas(){
        String query = "SELECT * FROM tarefa";
        List<Tarefa> tarefas = new ArrayList<>();

        try(var conexao = Banco.conectar()){
            PreparedStatement stmt = conexao.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                tarefas.add(new Tarefa(rs.getInt("id"),
                        rs.getString("ds_tarefa"),
                        rs.getString("nm_categoria"),
                        rs.getString("status")));
            }
            return tarefas.toString();
        } catch (Exception e){
            return e.getMessage();
        }
    }
    public String excluirTarefa(String ds_tarefa){
        String query = "DELETE FROM tarefa WHERE ds_tarefa = ?";

        try(var conexao = Banco.conectar()){
            PreparedStatement stmt = conexao.prepareStatement(query);

            stmt.setString(1, ds_tarefa);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return "Tarefa excluída com sucesso.";
            } else {
                return "Nenhuma consulta encontrada para os parâmetros fornecidos.";
            }
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
        }

    }

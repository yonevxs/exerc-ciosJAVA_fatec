package br.edu.fatecpg.tp.pokemonapi.client;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeApi {

    public String obterDados(String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response;

        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch(Exception e){
            throw new RuntimeException("Erro ao fazer requisição HTTP: " + e.getMessage());
        }

        if(response.statusCode() != 200){
            throw new RuntimeException("Falha na requisição: Código" + response.statusCode());
        }
        return response.body();
    }
}

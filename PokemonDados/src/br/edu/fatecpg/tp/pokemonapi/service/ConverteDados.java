package br.edu.fatecpg.tp.pokemonapi.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T converte(String json, Class<T> classe){
        try{
            return mapper.readValue(json, classe);
        } catch(JsonProcessingException e){
            throw new RuntimeException("Erro ao converter JSON para objeto" + e.getMessage());
        }
    }

}

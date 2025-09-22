package br.edu.fatecpg.tp.pokemonapi.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosPokemon(
        @JsonProperty("name") String nome,
        @JsonProperty("height") float altura,
        @JsonProperty("weight") float peso,
        @JsonProperty("types") List<EntradaTipo> tipos
) {

}

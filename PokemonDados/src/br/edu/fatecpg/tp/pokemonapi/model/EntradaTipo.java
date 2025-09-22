package br.edu.fatecpg.tp.pokemonapi.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EntradaTipo(
        @JsonProperty("type") DadosTipo tipo
) {
}

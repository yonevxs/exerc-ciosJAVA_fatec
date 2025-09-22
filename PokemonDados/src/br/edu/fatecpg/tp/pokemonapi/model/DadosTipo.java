package br.edu.fatecpg.tp.pokemonapi.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTipo(String name) {}

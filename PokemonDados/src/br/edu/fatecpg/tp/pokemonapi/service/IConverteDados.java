package br.edu.fatecpg.tp.pokemonapi.service;

public interface IConverteDados {
    <T> T converte(String json, Class<T> classe);
}

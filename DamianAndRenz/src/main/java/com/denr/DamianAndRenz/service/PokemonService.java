package com.denr.DamianAndRenz.service;

import java.util.Map;

import com.denr.DamianAndRenz.model.Pokemon;
import com.denr.DamianAndRenz.model.PokemonType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PokemonService {
	@SuppressWarnings({ "unused", "unchecked" })
	public Map<String, Object> getPokemon(){
		Pokemon pokemon = new Pokemon();
		pokemon.setPokedex_number(1);
		pokemon.setName("Bulbasaur");
		pokemon.setType(new PokemonType("Grass/Poison","Green/Purple"));
		pokemon.setAttack(10);
		pokemon.setDefense(10);
		pokemon.setHp(16);
		pokemon.setSpeed(10);
		pokemon.setLevel(1);
		
		PokemonService pokemonService = new PokemonService();
		ObjectMapper objectMap = new ObjectMapper();
		Map<String, Object> pokemonInfo = objectMap.convertValue(pokemon, Map.class);
		
		return pokemonInfo;
	}
}

package com.denr.DamianAndRenz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.denr.DamianAndRenz.service.PokemonService;

@Controller
public class PokemonMain {
	
	@GetMapping("/pokemon")
		public String getPokemon(Model model) {
		PokemonService pokemonService = new PokemonService();
		model.addAllAttributes(pokemonService.getPokemon());
		System.out.println("check " + pokemonService.getPokemon());
		
		return "pokemon";
	}



}

package com.denr.DamianAndRenz.model;

public class Pokemon {
	private Integer pokedex_number;
	private String name;
	private PokemonType type;
	private Integer level;
	private Integer hp;
	private Integer attack;
	private Integer defense;
	private Integer speed;
	public Integer getPokedex_number() {
		return pokedex_number;
	}
	public void setPokedex_number(Integer pokedex_number) {
		this.pokedex_number = pokedex_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PokemonType getType() {
		return type;
	}
	public void setType(PokemonType type) {
		this.type = type;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getDefense() {
		return defense;
	}
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getLevel() {
		return level;
	}
	@Override
	public String toString() {
		return "Pokemon [pokedex_number=" + pokedex_number + ", name=" + name + ", type=" + type + ", level=" + level
				+ ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + ", speed=" + speed + "]";
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
}

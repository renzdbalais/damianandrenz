package com.denr.DamianAndRenz.model;

public class PokemonType {
	private String typeName;
	private String typeColor;
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeColor() {
		return typeColor;
	}
	public void setTypeColor(String typeColor) {
		this.typeColor = typeColor;
	}
	public PokemonType(String typeName, String typeColor) {
		super();
		this.typeName = typeName;
		this.typeColor = typeColor;
	}
	@Override
	public String toString() {
		return "PokemonType [typeName=" + typeName + ", typeColor=" + typeColor + "]";
	}
	
	
}

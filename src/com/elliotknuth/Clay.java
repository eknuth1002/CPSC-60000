package com.elliotknuth;

public abstract class Clay {
	String description = "Generic Piece";
	
	public String getDescription() {
		return description;
	}

	abstract double costPerLb();
}
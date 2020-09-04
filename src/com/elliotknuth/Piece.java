package com.elliotknuth;

public abstract class Piece {
	Clay clay;
	
	double weight = 0;
	
	public abstract String getDescription();
	public double cost() {
		return clay.costPerLb() * weight;
	}
}

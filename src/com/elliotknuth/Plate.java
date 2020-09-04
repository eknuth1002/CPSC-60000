package com.elliotknuth;

public class Plate extends Piece {
	private Plate() {}
	
	public Plate(Clay clay) {
		this.clay = clay;
		weight = 5;
	}

	@Override
	public String getDescription() {
		return "Plate, " + clay.getDescription();
	}
}
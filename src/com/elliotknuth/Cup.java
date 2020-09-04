package com.elliotknuth;

public class Cup extends Piece {
	private Cup() {}
	
	public Cup(Clay clay) {
		this.clay = clay;
		weight = 1;
	}
	
	@Override
	public String getDescription() {
		return "Cup, " + clay.getDescription();
	}
}
package com.elliotknuth;

public class Bowl extends Piece {
	private Bowl() {}
	
	public Bowl(Clay clay) {
		this.clay = clay;
		weight = 3;
	}
	
	@Override
	public String getDescription() {
	 return "Bowl, " + clay.getDescription();
	}
}
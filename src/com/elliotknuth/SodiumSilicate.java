package com.elliotknuth;

public class SodiumSilicate extends PieceDecorator {
	private SodiumSilicate() {}
	
	public SodiumSilicate(Piece piece) {
		this.piece = piece;
		weight = piece.weight;
	}
	
	@Override
	public String getDescription() {
		return piece.getDescription() + ", Sodium Silicate";
	}

	@Override
	public double cost() {
		return piece.cost() + (.75 * weight);
	}
}

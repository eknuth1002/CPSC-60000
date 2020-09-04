package com.elliotknuth;

public class ClearGlaze extends PieceDecorator {
	private ClearGlaze() {}
	
	public ClearGlaze(Piece piece) {
		this.piece = piece;
		weight = piece.weight;
	}
	
	@Override
	public String getDescription() {
		return piece.getDescription() + ", Clear Glaze";
	}

	@Override
	public double cost() {
		return piece.cost() + (.18 * weight);
	}

}

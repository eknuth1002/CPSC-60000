package com.elliotknuth;

public class WhiteGlaze extends PieceDecorator {
	private WhiteGlaze() {}
	
	public WhiteGlaze(Piece piece) {
		this.piece = piece;
		weight = piece.weight;
	}
	
	@Override
	public String getDescription() {
		return piece.getDescription() + ", White Glaze";
	}

	@Override
	public double cost() {
		return piece.cost() + (.23 * weight);
	}

}

package com.elliotknuth;

public abstract class PieceDecorator extends Piece {
	Piece piece;
		
	public abstract String getDescription ();
	public abstract double cost();
}
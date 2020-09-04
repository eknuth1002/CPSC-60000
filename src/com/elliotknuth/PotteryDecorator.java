package com.elliotknuth;

public class PotteryDecorator {
	public static void printTotal(Piece piece) {
		System.out.printf(piece.getDescription() + " costs $%.2f\n", Math.round(piece.cost() * 100) / 100.0);
	}
	
	public static void main(String[] args) {
		
		//Descriptors to help manually calculate price output		
		Clay clay = new BMixWoodFire();
		System.out.println(clay.getDescription() + " costs $" + clay.costPerLb() + " per Lb");
		clay = new HawaiianRed();
		System.out.println(clay.getDescription() + " costs $" + clay.costPerLb() + " per Lb");
		
		PieceDecorator decor = new ClearGlaze(new Cup(new BMixWoodFire()));
		System.out.println("Clear Glaze costs $" + Math.round((decor.cost() - new BMixWoodFire().costPerLb()) * 100) / 100.0 + " per lb of clay used");
		decor = new WhiteGlaze(new Cup(new BMixWoodFire()));
		System.out.println("White Glaze costs $" + Math.round((decor.cost() - new BMixWoodFire().costPerLb()) * 100) / 100.0 + " per lb of clay used");
		decor = new SodiumSilicate(new Cup(new BMixWoodFire()));
		System.out.println("Sodium Silicate costs $" + Math.round((decor.cost() - new BMixWoodFire().costPerLb()) * 100) / 100.0 + " per lb of clay used\n");
		System.out.println("-=-=-=-=-=-=-");
		System.out.println("Pieces:\n");
		
		
		//Decorator examples		
		Piece piece = new Cup(new BMixWoodFire());
		piece = new SodiumSilicate(piece);
		piece = new ClearGlaze(piece);
		printTotal(piece);
		
		Piece piece2 = new Plate(new BMixWoodFire());
		piece2 = new SodiumSilicate(piece2);
		piece2 = new ClearGlaze(piece2);
		printTotal(piece2);
		
		piece = new Bowl(new HawaiianRed());
		piece = new WhiteGlaze(piece);
		piece = new ClearGlaze(piece);
		printTotal(piece);		
		
		piece = new Plate(new BMixWoodFire());
		piece = new ClearGlaze(piece);
		printTotal(piece);
		
		piece = new Cup(new HawaiianRed());
		piece = new WhiteGlaze(piece);
		printTotal(piece);
	}
	
	
}
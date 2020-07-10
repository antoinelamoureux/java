package com.antoinelamoureux.tp2;

public class TestBatiment {

	public static void main(String[] args) {
		Batiment batiment1 = new Batiment("5 rue de Stalingrad 75005 PARIS");
		Maison maison1 = new Maison("8 rue de Deauville 13000 MARSEILLE", 5);
		
		Batiment batiment2 = new Batiment();
		Maison maison2 = new Maison();
		
		batiment2.setAdresse("2 rue du Casino");
		maison2.setAdresse("8 rue de la Marne");
		maison2.setNbPieces(11);
		
		System.out.println(batiment1.toString());
		System.out.println(maison1.toString());
		System.out.println(batiment2.toString());
		System.out.println(maison2.toString());
	}

}

package com.antoinelamoureux.tp1;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Donner l'abscisse: ");
		double x = sc.nextDouble();
		System.out.print("Donner l'ordonne: ");
		double y = sc.nextDouble();
		sc.close();

		Point point = new Point(x, y);

		System.out.println("La norme du point (1,2) est: "+ point.norme(x, y));

	}

}

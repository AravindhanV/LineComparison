package com.bridgelabz.linecomparison;

import com.bridgelabz.linecomparison.Point;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,3);
		
		double len = Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p2.y-p1.y, 2));
		System.out.print("Length of line: "+len);
	}
}
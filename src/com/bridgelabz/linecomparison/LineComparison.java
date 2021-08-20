package com.bridgelabz.linecomparison;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1=1,x2=3,y1=1,y2=3;
		double len = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.print("Length of line: "+len);
	}
}

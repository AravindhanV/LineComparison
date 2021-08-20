package com.bridgelabz.linecomparison;

import com.bridgelabz.linecomparison.Point;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		//Line 1
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,3);
		Double len1 = p1.getDistance(p2);
		
		//Line 2
		Point p3 = new Point(2,2);
		Point p4 = new Point(4,4);
		Double len2 = p3.getDistance(p4);
		
		if(len1.equals(len2)) {
			System.out.println("Lines are Equal");
		} else {
			System.out.println("Lines are not equal");
		}
	}
}
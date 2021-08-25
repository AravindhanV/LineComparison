package com.bridgelabz.linecomparison;

import com.bridgelabz.linecomparison.Point;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		//Line 1
		Point point1 = new Point(1,1);
		Point point2 = new Point(3,3);
		Double length1 = point1.getDistance(point2);
		
		//Line 2
		Point point3 = new Point(3,2);
		Point point4 = new Point(4,4);
		Double length2 = point3.getDistance(point4);
		
		compareLines(length1,length2);
	}
	
	public static void compareLines(Double length1, Double length2) {
		if(length1.compareTo(length2)==0) {
			System.out.println("Lines are Equal");
		} else if(length1.compareTo(length2)<0){
			System.out.println("Line 1 is smaller than Line 2");
		} else {
			System.out.println("Line 1 is longer than Line 2");
		}
	}
}
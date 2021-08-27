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
		
		LengthComparisonIF lengthComparison = new LengthComparisonImpl();
		lengthComparison.checkEqual(length1,length2);
		lengthComparison.compareLength(length1, length2);
	}
}
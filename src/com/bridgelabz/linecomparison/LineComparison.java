package com.bridgelabz.linecomparison;

import com.bridgelabz.linecomparison.Point;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Line line1 = new Line(1,1,3,3);
		Line line2 = new Line(3,2,4,4);
		
		LengthComparisonIF lengthComparison = new LengthComparisonImpl();
		lengthComparison.checkEqual(line1.lineLength(),line2.lineLength());
		lengthComparison.compareLength(line1.lineLength(), line2.lineLength());
	}
}
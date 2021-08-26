package com.bridgelabz.linecomparison;

public class LengthComparisonImpl implements LengthComparisonIF {

	@Override
	public void checkEqual(Double length1, Double length2) {
		if(length1.equals(length2)) {
			System.out.println("Lines are equal");
		} else {
			System.out.println("Lines are not equal");
		}
	}

	@Override
	public void compareLength(Double length1, Double length2) {
		if(length1.compareTo(length2)==0) {
			System.out.println("Lines are Equal");
		} else if(length1.compareTo(length2)<0){
			System.out.println("Line 1 is smaller than Line 2");
		} else {
			System.out.println("Line 1 is longer than Line 2");
		}
	}

}

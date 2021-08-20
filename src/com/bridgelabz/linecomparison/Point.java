package com.bridgelabz.linecomparison;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Double getDistance(Point p) {
		return new Double(Math.sqrt(Math.pow(x-p.x, 2)+Math.pow(y-p.y, 2)));
	}
}

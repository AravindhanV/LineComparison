package com.bridgelabz.linecomparison;

public class Line {
	private Point point1;
	private Point point2;
	
	public Line(int x1,int y1,int x2,int y2) {
		this.point1 = new Point(x1,y1);
		this.point2 = new Point(x2,y2);
	}
	
	public Double lineLength() {
		return point1.getDistance(point2);
	}
}

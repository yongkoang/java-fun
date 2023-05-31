package model;

public class Spot {
	String name;
	public int height;
	String mountainName;
	String beforeSpot;
	String afterSpot;
	
	public Spot() {
		
	}	
	
	public Spot (String name, int height, String mountainName, String beforeSpot, String afterSpot) {
		this.name = name;
		this.height = height;
		this.mountainName = mountainName;
		this.beforeSpot = beforeSpot;
		this.afterSpot = afterSpot;
	}
	
	public void print() {
		System.out.println(name + " " + height + " " + mountainName + " " + beforeSpot + " " + afterSpot);
	}
}

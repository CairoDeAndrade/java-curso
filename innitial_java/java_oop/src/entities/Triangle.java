package entities;

public class Triangle {
	public double side1;
	public double side2;
	public double side3;
	
	public double triangle_area() {
		double p = (side1 + side2 + side3) / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
}

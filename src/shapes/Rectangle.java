package shapes;

public class Rectangle {
	//fields
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	//methods
	public Rectangle() {
		length=1;
		width=1;
		perimeter=findPerimeter();
		area=findArea();
	}
	
	public Rectangle(double side) {
		this.length=side;
		this.width=side;
		
	}
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
		this.perimeter=findPerimeter();
	}
	
	private double findPerimeter() {
		return this.length*2+this.width*2;
	}
	
	private double findArea() {
		return this.length*this.width;
	}
	
	public void printStats() {
		System.out.println("length" +this.length);
		System.out.println(width);
		System.out.println(perimeter);
		System.out.println(area);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length=length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	
}

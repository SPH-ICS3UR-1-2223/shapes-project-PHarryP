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
		this.perimeter=findPerimeter();
		this.area=findArea();
	}
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}
	
	private double findPerimeter() {
		return this.length*2+this.width*2;
	}
	
	private double findArea() {
		return this.length*this.width;
	}
	
	public void printStats() {
		System.out.println("Length: " +this.length);
		System.out.println("Width: " +this.width);
		System.out.println("Perimeter: " + this.perimeter);
		System.out.println("Area: " + this.area);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length=length;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	
}

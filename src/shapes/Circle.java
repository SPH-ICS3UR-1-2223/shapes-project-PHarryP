package shapes;

public class Circle {

	private double radius;
	private double circumference;
	private double area;
	
	//Methods
	public Circle() {
		radius=1;
		circumference=findCircumference();
		area=findArea();
	}
	
	public Circle(double r) {
		this.radius=r;
	}
	
	private double findCircumference() {
		return (22/7)*(this.radius+this.radius);
	}
	
	private double findArea() {
		return (22/7)*(this.radius*this.radius);
	}
	
	public void printStats() {
		System.out.println(radius);
		System.out.println(circumference);
		System.out.println(area);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
	
}

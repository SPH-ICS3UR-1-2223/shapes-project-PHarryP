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
		circumference=findCircumference();
		area=findArea();
	}
	
	private double findCircumference() {
		return Math.PI*(this.radius+this.radius);
	}
	
	private double findArea() {
		return Math.PI*(this.radius*this.radius);
	}
	 
	public void printStats() {
		System.out.println("Radius: " +this.radius);
		System.out.println("Circumference: " +this.circumference);
		System.out.println("Area: " +this.area);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		circumference=findCircumference();
		area=findArea();
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
	
}

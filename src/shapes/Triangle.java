package shapes;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	private double perimeter;
	private double area;
	
	//Methods
	public Triangle() {
		sideA=1;
		sideB=1;
		sideC=1;
		perimeter=findPerimeter();
		area=findArea();
	}
	
	public Triangle(double a, double b, double c) {
		sideA=a;
		sideB=b;
		sideC=c;
		perimeter=findPerimeter();
		area=findArea();
	}
	
	private double findPerimeter() {
		return this.sideA+this.sideB+this.sideC;
	}
	
	private double findArea() {
		return (this.sideA*this.sideB)/2;
	}
	
	public void printStats() {
		System.out.println("Side A: " +this.sideA);
		System.out.println("Side B: " +this.sideB);
		System.out.println("Side C: " +this.sideC);
		System.out.println("Perimeter: " +this.perimeter);
		System.out.println("Area: " +this.area);
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
		perimeter=findPerimeter();
		area=findArea();
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
		perimeter=findPerimeter();
		area=findArea();
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
		perimeter=findPerimeter();
		area=findArea();
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
	
	
}

package shapes;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rectangle r=new Rectangle(3, 5);
		//r.printStats();
		Scanner in= new Scanner(System.in);
		int userChoice;
		Rectangle r1;
		Triangle t1;
		Circle c1;
		do {
			System.out.println("Do you want to?:");
			System.out.println("1. Create a shape");
			System.out.println("2. View a shape");
			System.out.println("3. Change properties of a shape");
			System.out.println("4. Quit");
			try {
				userChoice = in.nextInt();
			} catch (InputMismatchException e) {
				userChoice = 4;
				System.out.println(" BYE ");
			}
			if (userChoice==1) {
				int userChoice1;
				do {
					System.out.println("What Shape Do you want?:");
					System.out.println("1. Rectangle");
					System.out.println("2. Circle");
					System.out.println("3. Triangle");
					System.out.println("4. Quit");
					try {
						userChoice1 = in.nextInt();
					} catch (InputMismatchException e) {
						userChoice1 = 4;
						System.out.println(" BYE ");
					}
					if (userChoice1==1) {
						System.out.println("What is the length?");
						double length=in.nextDouble();
						r1=new Rectangle(length);
						System.out.println("What is the width?");
						double width=in.nextDouble();
						r1=new Rectangle(width);
						r1.printStats();
					}else if (userChoice1==2) {
						System.out.println("What is the radius?");
						double radius=in.nextDouble();
						c1=new Circle(radius);
						c1.printStats();
					}else if (userChoice1==3) {
						System.out.println("What is the height?");
						double a=in.nextDouble();
//						t1=new Triangle(a);
						System.out.println("What is the base?");
						double b=in.nextDouble();
//						t1=new Triangle(b);
						System.out.println("What is the third side?");
						double c=in.nextDouble();
						t1=new Triangle(a,b,c);
						t1.printStats();
					}
				} while (userChoice1 !=4);
			}else if (userChoice==2) {
				int userChoice2;
				do {
					System.out.println("What shape do you want to view?");
					System.out.println("1. Rectangle");
					System.out.println("2. Circle");
					System.out.println("3. Triangle");
					System.out.println("4. Quit");
					try {
						userChoice2 = in.nextInt();
					} catch (InputMismatchException e) {
						userChoice2 = 4;
						System.out.println(" BYE ");
					}
					if (userChoice2==1) {
						r1 = new Rectangle();
						r1.printStats();
					}else if (userChoice2==2) {
						c1 = new Circle();
						c1.printStats();
					}else if (userChoice2==3) {
						t1 = new Triangle();
						t1.printStats();
					}
				} while (userChoice2 !=4);
				
			}else if (userChoice==3) 
			{
				int userChoice3;
				do {
					System.out.println("What shape do you want to modify?");
					System.out.println("1. Rectangle");
					System.out.println("2. Circle");
					System.out.println("3.Triangle");
					System.out.println("4. Quit");
					try {
						userChoice3 = in.nextInt();
					} catch (InputMismatchException e) {
						userChoice3 =4;
						System.out.println(" BYE ");
					}
					if (userChoice3==1) {
						System.out.println("What is the new length?");
						double length = in.nextDouble();
						r1 = new Rectangle(length);
						System.out.println("What is the new width?");
						double width = in.nextDouble();
						r1 = new Rectangle(width);
						r1.printStats();
					}else if (userChoice3==2) {
						System.out.println("What is your new radius?");
						double radius = in.nextDouble();
						c1 = new Circle(radius);
						c1.printStats();
					}else if (userChoice3==3) {
						System.out.println("What is your new height?");
						double a = in.nextDouble();
						System.out.println("What iis your new base?");
						double b = in.nextDouble();
						System.out.println("What is your new third side?");
						double c = in.nextDouble();
						t1=new Triangle(a,b,c);
						t1.printStats();
					}
				} while (userChoice3 !=4);
			}
		} while (userChoice !=4);
		System.out.println("BYE ");
		in.close();
	} 
}



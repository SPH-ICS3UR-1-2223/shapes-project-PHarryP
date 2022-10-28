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
		do {
			System.out.println("Do you want to?:");
			System.out.println("1. Create a shape");
			System.out.println("2. View a shape");
			System.out.println("3. Change properties of a shape");
			System.out.println("4. quit");
			try {
				userChoice = in.nextInt();
			} catch (InputMismatchException e) {
				userChoice = 4;
				System.out.println(" BYE ");
			}
			if (userChoice==1) {
				
			}else if (userChoice==2) {
				
			}else if (userChoice==3) {
				
			}
		} while (userChoice !=4);
	}
}



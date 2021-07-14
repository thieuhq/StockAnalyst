package lab02;
import java.util.Scanner;
public class DisplayTriangle {
	
	// Function: Input a integer number
	public static int InputInt (){
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();
		scan.close();
		return intNum;
	}
	
	// Function: Input a integer number and check if it is a integer number? 
	// If true, return the integer number, if false, input again
	public static int InputIntAndCheck () {
		int intNumAndCheck = -1;
		boolean check = false;
		while (!check){
			try{	
				System.out.print("Input integer number: ");
				intNumAndCheck = InputInt();
				check = true;
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("You need to input a integer number.");
				check = false;
			}
		}
		return intNumAndCheck;
	}
	
	// Function Draw Nth line of the triangle with the height H
	public static void DrawLineN (int N, int H) {
		for (int j=1; j<H-N+1; j++) {
			System.out.print(" ");
		}
		
		for (int j=H-N+1; j<=H+N-1; j++) {
			System.out.print("*");
		}
		
		for (int j=H+N; j<2*H-1; j++) {
			System.out.print(" ");
		}
	}
	
	// Function: Draw a triangle with the inputed integer number as height
	public static void DrawTriangleWithHeight (int a) {
		for (int i=1; i<=a; i++) {
			if (i!=a) {
				DrawLineN(i, a);
				System.out.println();
			}
			else {
				DrawLineN(a, a);
			}
		}
	}
	
	public static void main(String[] args) {
		DrawTriangleWithHeight(InputIntAndCheck());
	}
}

package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static int InputInt (){
		Scanner scanf = new Scanner(System.in);
		int so = scanf.nextInt();
		return so;
	}
	public static int InputPositiveInteger () {
		int a = -1;
		boolean check = false;
		while (!check){
			try{	
				a = InputInt();
				if (a>0) {
					check = true;
				}
				else{
					System.out.println("You need to input a positive number.");
					check = false;
				}
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("You need to input a integer number.");
				check = false;
			}
		}
		return a;
	}
	
	public static double InputDouble (){
		Scanner scannn = new Scanner(System.in);
		double so = scannn.nextDouble();
		return so;
	}
	public static double InputDoubleAndCheck () {
		double a = -1;
		boolean check = false;
		while (!check){
			try{	
				a = InputDouble();
				check = true;
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("You need to input a double number.");
				check = false;
			}
		}
		return a;
	}
	public static void main (String[] args) {
		
		System.out.print("Input length of the array: ");
		int length = InputPositiveInteger();	
		
		double array[] = new double[length];
		for (int i=0; i<length; i++) {
			System.out.print("Input array["+i+"]: ");
			array[i] = InputDoubleAndCheck();
		}
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
}

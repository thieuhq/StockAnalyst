package lab02;

import java.util.Scanner;

public class AddMatrix {
	public static int InputInt (){
		Scanner scanf = new Scanner(System.in);
		int so = scanf.nextInt();
		return so;
	}
	
	public static int InputIntAndCheck () {
		int a = -1;
		boolean check = false;
		while (!check){
			try{	
				a = InputInt();
				check = true;
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
   
	public static void main(String args[]){
		System.out.println("how many row?");
        int row= InputIntAndCheck();
        System.out.println("how many column");
        int col= InputIntAndCheck();
        
        //Input matrix A
        System.out.println("input matrix A");
        double matrixA[][]=new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("  A["+i+","+j+"]=");
                matrixA[i][j]=InputDoubleAndCheck();
            }
            System.out.println();
        }
		
        //Input matrix B
        System.out.println("input matrix B");
        double matrixB[][]=new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("  B["+i+","+j+"]=");
                matrixB[i][j]=InputDoubleAndCheck();
            }
            System.out.println();
        }
        
        //Create matrix Sum
        double matrixSum[][]=new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixSum[i][j]= matrixA[i][j] + matrixB[i][j];
            }
        }
        
        //Print matrix Sum
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((double) Math.round(1000*matrixSum[i][j] )/ 1000 +"\t");
            }
            System.out.println();
        }
	}	
}

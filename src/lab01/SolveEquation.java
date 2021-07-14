package lab01;

import javax.swing.JOptionPane;

public class SolveEquation {
	public static void main (String[] args) {
		Menu();
	}
	
	//Build the menu option
	public static void Menu() {
		//Choose the type of equation
		String strMenuNum = "\0";
		int intMenuNum = 0;
		boolean check = false;
		while(!check) {
			try {
				strMenuNum = JOptionPane.showInputDialog(null,
						"1. Linear equation\n"
					+ 	"2. Linear system\n"
					+	"3. Quadratic equation\n"
					+ 	"4. Exit",
					"Choose the type of equation:",JOptionPane.INFORMATION_MESSAGE);
				intMenuNum = Integer.parseInt(strMenuNum);
				if (intMenuNum >4|| intMenuNum <1){
					JOptionPane.showMessageDialog(null, "You need to input 1,2,3 or 4");
					check = false;
					}
				else check = true;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "You need to input 1,2,3 or 4");
			}
		}
		
		//Solve equations base on menuNum
		switch(intMenuNum) {
			case 1: LinearEquation();
					Menu();
					break;
			case 2: LinearSystem();
					Menu();
					break;
			case 3: QuadraticEquation();
					Menu();
					break;
			case 4: System.exit(0);
		}
	}
	
	//Function for input a double number
	public static double InputDouble() {
		String strNum;
		double douNum=0;
		boolean check = false;
		while (!check){
			try {
				strNum = JOptionPane.showInputDialog(null,
						"Input a double number: ", "",
						JOptionPane.INFORMATION_MESSAGE);
				douNum = Double.parseDouble(strNum);
				check = true;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "You need to input a double number");
			}
		}
		return douNum;
	}
	
	//Solve Linear Equation
	public static void LinearEquation() {
		String strNotification= "";
		JOptionPane.showMessageDialog(null, 
				"First, you need to input a", "Solve Linear Equation: a.x + b = 0", 
				JOptionPane.INFORMATION_MESSAGE);
		double douA = InputDouble();
		JOptionPane.showMessageDialog(null, 
				"Next, you need to input b", "Solve Linear Equation: a.x + b = 0", 
				JOptionPane.INFORMATION_MESSAGE);
		double douB = InputDouble();
				
		if(douA==0 && douB==0){
			strNotification = "The equation has infinite solution";}
		else if (douA==0 && douB!=0){
			strNotification = "The equation has no solution";}
		else {
			strNotification = "The equation has one solution x =" + String.valueOf(-douB*1.0/douA);}
		
		JOptionPane.showMessageDialog(null, 
				strNotification,"Solve: a.x+b=0 (a = "+douA+"; b = "+douB+")",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Solve Linear System
	public static void LinearSystem() {
		String strNotification= "";
		JOptionPane.showMessageDialog(null, 
				"Solve Linear System:\n"
				+ "a11.x1 + a12.x2 = b1\n"
				+ "a21.x1 + a22.x2 = b2", 
				"Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"First, you need to input a11", "Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
		double douA11 = InputDouble();
		JOptionPane.showMessageDialog(null,
				"Next, you need to input a12", "Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
		double douA12 = InputDouble();
		JOptionPane.showMessageDialog(null,
				"Then, you need to input b1", "Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
		double douB1 = InputDouble();
		JOptionPane.showMessageDialog(null, 
				"Second, you need to input a21", "Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
		double douA21 = InputDouble();
		JOptionPane.showMessageDialog(null, 
				"Then, you need to input a22", "Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
		double douA22 = InputDouble();
		JOptionPane.showMessageDialog(null,	
				"Final, you need to input b2", "Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
		double douB2 = InputDouble();
		
		double D = douA11*douA22 - douA21*douA12;
		double D1 = douB1*douA22 - douB2*douA12;
		double D2 = douA11*douB2 - douA21*douB1;
		if(D==0) {
			if(D1==0 && D2==0)
				strNotification = "The equation has infinite solution";
			else 
				strNotification = "The equation has no solution";
		}
		else 
			strNotification ="The equation has one solution "
							+"(x1;x2)=("+ String.valueOf(D1/D)+";"+String.valueOf(D2/D)+")";
		
		JOptionPane.showMessageDialog(null, 
				strNotification,"Solve Linear System",JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Solve Quadratic Equation
	public static void QuadraticEquation() {
		String strNotification= "";
		
		JOptionPane.showMessageDialog(null, 
				"First, you need to input a", "Solve Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);
		double douA = InputDouble();
		JOptionPane.showMessageDialog(null, 
				"Next, you need to input b", "Solve Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);
		double douB = InputDouble();
		JOptionPane.showMessageDialog(null, 
				"Final, you need to input c", "Solve Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
		double douC = InputDouble();
		
		if(douA==0) {
			if (douB==0 ) {
				if (douC ==0)
					strNotification = "The equation has infinite solution";
				else
					strNotification = "The equation has no solution";
			}
			else
				strNotification = "The equation has one solution x =" + String.valueOf(-douC*1.0/douB);
		}
		else {
			double delta = douB*douB - 4*douA*douC;
			if(delta == 0) 
				strNotification = "The equation has double root " + String.valueOf(-douB/(2*douA));
			else if(delta >0) 
				strNotification = "The equation has root:"
						+ "(x1,x2)=("+ String.valueOf((-douB+Math.sqrt(delta))/(2*douA)) + "," +String.valueOf((-douB-Math.sqrt(delta))/(2*douA))+")";
			else 
				strNotification = "The equation has no solution";
		}
		JOptionPane.showMessageDialog(null, 
				strNotification,"Solve Quadratic Equation:",JOptionPane.INFORMATION_MESSAGE);	
	}
}

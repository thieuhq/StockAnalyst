package lab01;
import javax.swing.JOptionPane;

public class CalculateDoubleNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		
		double douNum1, douNum2;
		douNum1 = Double.parseDouble(strNum1);
		douNum2 = Double.parseDouble(strNum2);
		
		JOptionPane.showMessageDialog(null, 
				douNum1+douNum2,"Addtion: ",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, 
				douNum1-douNum2, "Subtraction: ", 
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, 
				douNum1*douNum2,"Multiplication: ",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, 
				(double) Math.round(douNum1* 100000/douNum2) / 100000,"Division(5 number after point): ",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}

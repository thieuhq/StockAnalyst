package lab02;

import java.util.Scanner;

public class DisplayNumOfDaysInMonth {
	public static int InputInt (){
		Scanner scan = new Scanner(System.in);
		int so = scan.nextInt();
		return so;
	}
	public static int InputYear () {
		int a = -1;
		boolean check = false;
		while (!check){
			try{	
				System.out.print("Input Year: ");
				a = InputInt();
				if (a>=0) {
					check = true;
				}
				else{
					System.out.println("You need to input a non-negative number.");
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
	
	public static boolean CheckLeapYear (int year) {
		boolean leap = false;
	
	    if (year % 4 == 0) {
	      
	    	if (year % 100 == 0 && year % 400 == 0)
	    		leap = true;
	    	else if (year % 100 == 0 && year % 400 != 0)
	    		leap = false;
	    	else
	    		leap = true;
	    }
	    else
	      leap = false;
	    
	    return leap;
	}
	
	public static int InputMonth () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month: ");
		String inputMonth = sc.nextLine();
		int intMonth=0;
		switch (inputMonth) {
	
			case "January":	  case "Jan.": 	case "Jan":	case "1":
				intMonth = 1;
				break;
				
			case "March": 	  case "Mar.":	case "Mar":	case "3":
				intMonth = 3;
				break;
				
			case "May":		  case "5":
				intMonth = 5;
				break;
				
			case "July":	  case "Jul":		case "7":
				intMonth = 7;
				break;
				
			case "August":	  case "Aug.":	case "Aug":	case "8":
				intMonth = 8;
				break;
				
			case "October":	  case "Oct.":	case "Oct":	case "10":
				intMonth = 10;
				break;
				
			case "December":  case "Dec.":	case "Dec":	case "12":
				intMonth = 12;
				break;
				
			case "February":  case "Feb.":	case "Feb":	case "2":
				intMonth = 2;
				break;
			
			case "April":	  case "Apr.":	case "Apr":	case "4":
				intMonth = 4;
				break;
				
			case "June":	  case "Jun":		case "6":		
				intMonth = 6;
				break;
				
			case "September": case "Sept":	case "Sep":	case "9":
				intMonth = 9;
				break;
				
			case "November":  case "Nov.":	case "Nov":	case "11":
				intMonth = 11;
				break;
			
			default:
				System.out.println("Invalid month. Input again");
		}	
		
		if (intMonth==0)
			intMonth = InputMonth();
		
		return intMonth;
	}
	
	public static void GetNumOfDaysInMonth (int month, int year) {
		int dayInMonth=0;
		switch (month) {

			case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
				dayInMonth = 31;
				break;
				
			case 2:
				dayInMonth = (CheckLeapYear(year))? 29:28;
				break;
			
			case 4:	case 6:	case 9:	case 11:		
				dayInMonth = 30;
				break;
		}
		System.out.println("Month "+month+" of year "+year+" have "+dayInMonth+" days.");;
	}
	
	public static void main (String[] args) {
		GetNumOfDaysInMonth(InputMonth(), InputYear());
	}
}

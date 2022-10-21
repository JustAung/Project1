import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, res=0;
		
		char choice, ch;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
		//Prepare the menu for user
		System.out.println("\n\nMain Menu: \n1.Addition\n2.Subtraction"
				+"\n3.Multiplication\n4.Division\n5.Square\n6.Square Root"
				+"\n7.Exponent\n8.COS\n9.SIN\nA.TAN\nB.MAX\nC.MIN"
				+ "\nD.LN\nE.LOG\nF.Cube\nG.Arc Sine\nH.Arc Cosine"
				+ "\nI.Arc Tangent Root\nJ.Absolute Value\nK.Round \nq.Exit\n");
		
		System.out.println("Enter your choice: ");
		
		choice = scan.next().charAt(0);
			
		switch(choice) {
		
		case '1': 
			System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			
			res=a+b;
			System.out.println("Result: "+res);
			break;
		case '2': 
			System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			
			res=a-b;
			System.out.println("Result: "+res);
			break;
		case '3': 
			System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			
			res=a*b;
			System.out.println("Result: "+res);
			break;
		case '4': 
			System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			
			res=a/b;
			System.out.println("Result: "+res);
			break;
		case '5': 
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.pow(a, 2);
			System.out.println("Result: "+res);
			break;
		case '6':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.sqrt(a);
			System.out.println("Result: "+res);
			break;
		case '7':
			System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			
			res=(float) Math.pow(a,b);
			System.out.println("Result: "+res);
			break;
		case '8':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			a = (float) Math.toRadians(a);
			System.out.println("Result:" + Math.cos(a));
			break;
		case '9':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			a = (float) Math.toRadians(a);
			System.out.println("Result:" + Math.sin(a));
			break;
		case 'A':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			a = (float) Math.toRadians(a);
			System.out.println("Result: "+ Math.tan(a));
			break;
		case 'B':
			System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			
			res=(float) Math.max(a, b);
			System.out.println("Result: "+ res);
			break;
		case 'C':
			System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			
			res=(float) Math.min(a, b);
			System.out.println("Result: "+ res);
			break;
		case 'D':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.log(a);
			System.out.println("Result: "+ res);
			break;
		case 'E':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.log10(a);
			System.out.println("Result: "+ res);
			break;
		case 'F':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.cbrt(a);
			System.out.println("Result: "+ res);
			break;
		case 'G':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.asin(a);
			System.out.println("Result: "+ res);	
			break;
		case 'H':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.acos(a);
			System.out.println("Result: "+ res);
			break;
		case 'I':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.atan(a);
			System.out.println("Result: "+ res);
			break;
		case 'J':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.abs(a);
			System.out.println("Result: "+ res);
			break;
		case 'K':
			System.out.println("Enter one number");
			a = scan.nextFloat();
			
			res=(float) Math.round(a);
			System.out.println("Result: "+ res);
			break;
			
			
		
		case 'q': 
			System.exit(0);
			break;
			
		default:
			System.out.println("The choice is not present in main menu");
			break;
			
		}	
		}
		while(choice!='q');
				
	}

}

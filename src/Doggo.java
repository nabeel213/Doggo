import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Doggo {
	public static void main(String[] args) {

		/*
		 * System.exit.(0); System.out.println("Wheres your dog? "); Scanner scan = new
		 * Scanner(System.in); int num = scan.nextInt(); myMethod(num);
		 */

		String input = JOptionPane.showInputDialog(null, "wheres your dog?");
		int input2 = Integer.parseInt(input);
		
		myMethod(input2);
	}

	public static void myMethod(int input2) {
		
		//int counter = 0;
		
		int [] s = new int [100];
		
		for (int i=0; i<100; i++) {
			
			s [i] = i+1;
			//System.out.println(s[i]);
		}
		
		String type = "";
		
		for (int i=0; i<100; i++) {
			
			
			if(input2 % 10==0) {
			
				if(i+1 != input2) {
		
					type = " th";
					System.out.println(s[i] + type);
				}
				
				
			else if( input2  %10==0) {
				
					type = "th";
			System.out.println(s[i] + type);
				}
				
				
				else if(input2 %10==1) {
					type = "st";
					System.out.println(s[i] + type);
				}
				
				
				else if (input2 %10==2){
					type = "nd";
					System.out.println(s[i] + type);
					
				}
				}
			}
	}

}

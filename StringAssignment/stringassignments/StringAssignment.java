package javatraining.stringassignments;
import java.util.Scanner;

public class StringAssignment  {

	public static void main(String[] args) {
		
		ItContainsString str=new ItContainsString(null); 
		ItContainsDigit str1=new ItContainsDigit(null);
		ItContainsBoth str2=new ItContainsBoth(null);
		
		str.setStrVariable("Hello");
		str1.setStrDigit("12345");
		str2.setStrBoth("ABCD1234");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your choice... \n1.It contains string only \r\n 2. It contains digit only \n 3.It contains string as well"); 
		int choice=sc.nextInt();
		sc.close();
		switch(choice) {
			case 1:
				str.ContainString();
		
			case 2:
				str1.CotainsDigit();
		
			case 3:
				str2.CotainsBoth();
			
			
		}
		
		
	}
		
		

}
